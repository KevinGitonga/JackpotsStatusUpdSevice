package ke.co.ipandasoft.jackpotsupdservice.utils;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class SyncRequestExec {

    /**
     * Execute a REST call and block until the response is received.
     */
    public static <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            } else {
                System.out.println("ERROR OCCURED"+new Gson().toJson(response.body().toString()));
            }
        } catch (IOException e) {
            System.out.println("ERROR OCCURED"+e.getLocalizedMessage());
        }
        return null;
    }
}
