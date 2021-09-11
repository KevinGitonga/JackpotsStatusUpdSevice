package ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork;

import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class JackpotsApiClient {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().connectTimeout(30,TimeUnit.SECONDS);


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(ApiConstants.JACKPOT_PREDICTIONS_NET_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static JackpotsApiService jackpotsApiService(){
        builder.client(httpClient.build());
        retrofit=builder.build();
        return retrofit.create(JackpotsApiService.class);
    }
}
