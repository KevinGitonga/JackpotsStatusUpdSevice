package ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork;


import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.ApiAuthPayload;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.FixturesPostModel;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.apiauth.ApiAuthResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.JackpotsDataResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationapimodels.NotificationPostRequest;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationapimodels.NotificationPostResponse;
import ke.co.ipandasoft.jackpotsupdservice.utils.SyncRequestExec;

import java.util.List;

public class JackpotsApiSyncClient {

    private final JackpotsApiService jackpotsApiService;

    public JackpotsApiSyncClient(JackpotsApiService jackpotsApiService) {
        this.jackpotsApiService = jackpotsApiService;
    }

    public ApiAuthResponse authClientToApi(ApiAuthPayload apiAuthPayload){
        return SyncRequestExec.executeSync(jackpotsApiService.authenticateUser(apiAuthPayload));
    }

    public List<JackpotsDataResponse> loadPendingJackpotForUpd(String token){
        return SyncRequestExec.executeSync(jackpotsApiService.loadJackpotsForUpd(ApiConstants.BEARER_TOKEN_HEADER+token,"id:desc","jackpot_pending"));
    }

    public void updateJackpotObjStatus(String token,JackpotsDataResponse jackpotsDataResponse,Integer jackpotId){
        SyncRequestExec.executeSync(jackpotsApiService.updateJackpotStatus(ApiConstants.BEARER_TOKEN_HEADER+token,jackpotsDataResponse,jackpotId.toString()));
    }

    public NotificationPostResponse postNotification(String token, NotificationPostRequest notificationPostRequest){
        return  SyncRequestExec.executeSync(jackpotsApiService.postNotification(ApiConstants.BEARER_TOKEN_HEADER+token,notificationPostRequest));
    }
}
