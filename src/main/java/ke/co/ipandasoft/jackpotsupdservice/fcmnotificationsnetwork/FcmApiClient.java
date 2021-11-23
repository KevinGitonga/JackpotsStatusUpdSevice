package ke.co.ipandasoft.jackpotsupdservice.fcmnotificationsnetwork;

import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class FcmApiClient {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().connectTimeout(30,TimeUnit.SECONDS);


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(ApiConstants.FCM_NET_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static Retrofit retrofit = builder.build();

    public static FcmApiService fcmApiService(){
        builder.client(httpClient.build());
        retrofit=builder.build();
        return retrofit.create(FcmApiService.class);
    }
}
