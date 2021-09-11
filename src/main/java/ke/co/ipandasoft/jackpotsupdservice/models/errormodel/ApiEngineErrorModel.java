package ke.co.ipandasoft.jackpotsupdservice.models.errormodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiEngineErrorModel {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     */
    public ApiEngineErrorModel() {
    }

    /**
     * @param error
     * @param message
     * @param statusCode
     */
    public ApiEngineErrorModel(Integer statusCode, String error, String message) {
        super();
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}