package ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork;

import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendRequest;
import ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels.NotificationSendResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface FcmApiService {

    @POST("fcm/send")
    Call<NotificationSendResponse> sendNotification(@Body NotificationSendRequest notificationSendRequest, @Header("Authorization") String authToken);

}
