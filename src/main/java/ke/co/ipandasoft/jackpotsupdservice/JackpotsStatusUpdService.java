package ke.co.ipandasoft.jackpotsupdservice;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;
import com.google.gson.Gson;
import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork.FcmApiClient;
import ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork.FcmApiService;
import ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork.FcmApiSyncClient;
import ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork.JackpotsApiClient;
import ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork.JackpotsApiService;
import ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork.JackpotsApiSyncClient;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.ApiAuthPayload;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.FixturesPostModel;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.JpWinLostDataModel;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.apiauth.ApiAuthResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.Fixture;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.JackpotsDataResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationapimodels.NotificationPostRequest;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationapimodels.NotificationPostResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.Data;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.Notification;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendRequest;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendResponse;
import ke.co.ipandasoft.jackpotsupdservice.utils.TimeProvider;
import ke.co.ipandasoft.jackpotsupdservice.utils.WinCalcUtil;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class JackpotsStatusUpdService implements HttpFunction {

    //DATA LOGGER
    public static final Logger logger = Logger.getLogger(JackpotsStatusUpdService.class);

    //NOTIFICATION API
    private FcmApiService fcmApiService;
    private FcmApiSyncClient fcmApiSyncClient;

    //JACKPOTS-API
    private JackpotsApiService jackpotsApiService;
    private JackpotsApiSyncClient jackpotsApiSyncClient;

    public static final Gson gson=new Gson();
    private static HttpResponse httpResponse;
    private String queryType;

    //API ACCESS TOKEN
    public String apiAuthUserToken = null;

    @Override
    public void service(HttpRequest request, HttpResponse response) throws Exception {
      BasicConfigurator.configure();
      httpResponse=response;
      httpResponse.setContentType("application/json");
      queryType=request.getPath();
      logger.info("PASSED QUERY"+queryType);

      if(queryType.contains(ApiConstants.UPDATE_JACKPOT_STATUS_QUERY)){
          initApiAuth();
      }

    }

    private void initApiAuth() throws IOException, InterruptedException {
        ApiAuthPayload apiAuthPayload= new ApiAuthPayload(ApiConstants.API_AUTH_USER_NAME,ApiConstants.API_AUTH_PASSWORD);
        jackpotsApiService= JackpotsApiClient.jackpotsApiService();
        jackpotsApiSyncClient=new JackpotsApiSyncClient(jackpotsApiService);
        ApiAuthResponse jpApiAuthResponse= jackpotsApiSyncClient.authClientToApi(apiAuthPayload);
        apiAuthUserToken=jpApiAuthResponse.getJwt();

        initLoadJackpots();
    }

    private void initLoadJackpots() throws IOException {
        jackpotsApiService= JackpotsApiClient.jackpotsApiService();
        jackpotsApiSyncClient=new JackpotsApiSyncClient(jackpotsApiService);
        List<JackpotsDataResponse> jackpotsDataResponseList = jackpotsApiSyncClient.loadPendingJackpotForUpd(apiAuthUserToken);
        logger.info("IST JACKPOT DATA OBJ"+gson.toJson(jackpotsDataResponseList.get(0)));

        for (int i = 0; i < jackpotsDataResponseList.size(); i++) {
            JackpotsDataResponse jackpotsDataResponse = jackpotsDataResponseList.get(i);
            List<Fixture> fixtureList = jackpotsDataResponse.getFixtures();
            Fixture lastFixture = WinCalcUtil.getLastPlayFixture(fixtureList);

            logger.info("LAST JACKPOT DATA OBJ"+gson.toJson(lastFixture));

            if (!lastFixture.getFixtureAiTipStatus().equals(ApiConstants.MATCH_STATUS_PENDING) && TimeProvider.isJackpotCompleted(lastFixture.getFixtureDate(),lastFixture.getFixtureEatTime())){
                JpWinLostDataModel jpWinLostDataModel = WinCalcUtil.checkWinners(fixtureList);
                jackpotsDataResponse.setJackpotStatus(ApiConstants.JACKPOT_ENDED);
                jackpotsDataResponse.setTotalFixturesWon(jpWinLostDataModel.getWonFixtures()+"/"+fixtureList.size());
                jackpotsDataResponse.setTotalFixturesLost(jpWinLostDataModel.getLostFixtures()+"/"+fixtureList.size());
                updateJackpotGamesStatus(jackpotsDataResponse);
            }
        }
    }

    private void updateJackpotGamesStatus(JackpotsDataResponse jackpotsDataResponse) throws IOException {
        logger.info("JACKPOT OBJ BEING POSTED TO API CAT"+gson.toJson(jackpotsDataResponse.getCategory()));
        jackpotsApiSyncClient.updateJackpotObjStatus(apiAuthUserToken,jackpotsDataResponse,jackpotsDataResponse.getId());
        sendPushNotification(jackpotsDataResponse);
    }

    private void sendPushNotification(JackpotsDataResponse jackpotsDataResponse) throws IOException {
        fcmApiService= FcmApiClient.fcmApiService();
        fcmApiSyncClient=new FcmApiSyncClient(fcmApiService);

        Notification notification = new Notification();
        notification.setTitle("Soccer Jackpot Tips");

        String jackpotCategory = jackpotsDataResponse.getCategory().getJackpotCategoryName();
        String jackpotTotalWonGames = jackpotsDataResponse.getTotalFixturesWon();
        String jackpotTotalLost = jackpotsDataResponse.getTotalFixturesLost();

        logger.info("CATEGORY TOTAL WON"+jackpotCategory+jackpotTotalWonGames);
        notification.setBody(ApiConstants.JACKPOTS_RESULT_UPDATED_START_TAG + " "+ jackpotCategory +" "+ApiConstants.JACKPOT_START_DATE_TAG+ " "+jackpotsDataResponse.getJackpotStartDate()+" "+ApiConstants.JACKPOT_RESULT_UPDATED_MIDDLE_TAG +" "+jackpotTotalWonGames+" "+ApiConstants.JACKPOT_RESULT_UPDATED_AND_TAG+" "+jackpotTotalLost+" "+ApiConstants.JACKPOT_RESULT_UPDATED_END_TAG);

        Data data = new Data();
        data.setKey1("Value for key_1");
        data.setKey2("Value for key_1");

        String currentTimeStamp = String.valueOf(new Date().getTime());

        NotificationSendRequest notificationSendRequest = new NotificationSendRequest();
        notificationSendRequest.setNotification(notification);
        notificationSendRequest.setData(data);
        notificationSendRequest.setCollapseKey(currentTimeStamp);
        notificationSendRequest.setTo(ApiConstants.SJT_MAIN_NOTIFICATIONS_CHANNEL);
        notificationSendRequest.setNotificationTimeToLive(ApiConstants.DEFAULT_NOTIFICATION_TTL_CONFIG);

        NotificationSendResponse notificationSendResponse= fcmApiSyncClient.sendEventNotification(notificationSendRequest);

        if (notificationSendResponse.getMessageId() != null){
            logger.error("NOTIFICATION SEND SUCCESS TO TOPIC" + gson.toJson(notificationSendResponse));
            postNotificationToApi(notification);
        }
    }

    private void postNotificationToApi(Notification notification) {
        NotificationPostRequest notificationPostRequest = new NotificationPostRequest();
        notificationPostRequest.setNotificationTitle(notification.getTitle());
        notificationPostRequest.setNotificationMessage(notification.getBody());
        notificationPostRequest.setNotificationTimestamp(TimeProvider.getLocalizedTimestamp().toString());
        NotificationPostResponse notificationPostResponse = jackpotsApiSyncClient.postNotification(apiAuthUserToken,notificationPostRequest);

        if (notificationPostResponse.getNotificationMessage() != null){
            logger.error("NOTIFICATION SAVED TO API SUCCESS" + gson.toJson(notificationPostResponse));
        }
    }

}
