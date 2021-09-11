package ke.co.ipandasoft.jackpotsupdservice.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostDataWriteOut {

@SerializedName("response_code")
@Expose
private String responseCode;
@SerializedName("response_message")
@Expose
private String responseMessage;
@SerializedName("fixtures_post_date")
@Expose
private String fixturesPostDate;

public String getResponseCode() {
return responseCode;
}

public void setResponseCode(String responseCode) {
this.responseCode = responseCode;
}

public String getResponseMessage() {
return responseMessage;
}

public void setResponseMessage(String responseMessage) {
this.responseMessage = responseMessage;
}

public String getFixturesPostDate() {
return fixturesPostDate;
}

public void setFixturesPostDate(String fixturesPostDate) {
this.fixturesPostDate = fixturesPostDate;
}

}