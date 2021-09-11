
package ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.apiauth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiAuthResponse {

    @SerializedName("jwt")
    @Expose
    private String jwt;
    @SerializedName("user")
    @Expose
    private User user;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiAuthResponse() {
    }

    /**
     * 
     * @param jwt
     * @param user
     */
    public ApiAuthResponse(String jwt, User user) {
        super();
        this.jwt = jwt;
        this.user = user;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
