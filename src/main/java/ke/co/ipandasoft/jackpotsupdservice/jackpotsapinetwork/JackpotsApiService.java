package ke.co.ipandasoft.jackpotsupdservice.jackpotsapinetwork;

import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.ApiAuthPayload;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.FixturesPostModel;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.apiauth.ApiAuthResponse;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.JackpotsDataResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface JackpotsApiService {

    @POST("auth/local")
    Call<ApiAuthResponse> authenticateUser(@Body ApiAuthPayload apiAuthPayload);

    @GET("jackpots")
    Call<List<JackpotsDataResponse>> loadJackpotsForUpd(@Header("Authorization") String authToken, @Query("_sort") String sortBy,@Query("jackpot_status") String jackpotStatus);

    @PUT("jackpots/{id}")
    Call<Void> updateJackpotStatus(@Header("Authorization") String authToken, @Body JackpotsDataResponse jackpotsDataResponse,@Path("id") String jackpotId);

}