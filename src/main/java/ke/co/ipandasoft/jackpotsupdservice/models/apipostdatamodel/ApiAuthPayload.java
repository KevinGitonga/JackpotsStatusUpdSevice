package ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiAuthPayload {

    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("password")
    @Expose
    private String password;

    /**
     * No args constructor for use in serialization
     */
    public ApiAuthPayload() {
    }

    /**
     * @param identifier
     * @param password
     */
    public ApiAuthPayload(String identifier, String password) {
        super();
        this.identifier = identifier;
        this.password = password;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}