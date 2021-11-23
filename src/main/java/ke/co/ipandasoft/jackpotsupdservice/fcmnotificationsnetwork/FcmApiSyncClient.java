package ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork;


import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendRequest;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendResponse;
import ke.co.ipandasoft.jackpotsupdservice.utils.SyncRequestExec;

public class FcmApiSyncClient {

    private final FcmApiService fcmApiService;

    public FcmApiSyncClient(FcmApiService fcmApiService) {
        this.fcmApiService = fcmApiService;
    }

    public NotificationSendResponse sendEventNotification(NotificationSendRequest notificationSendRequest){
        return SyncRequestExec.executeSync(fcmApiService.sendNotification(notificationSendRequest,"key="+ ApiConstants.FIREBASE_MESSAGING_API_KEY));
    }
}
