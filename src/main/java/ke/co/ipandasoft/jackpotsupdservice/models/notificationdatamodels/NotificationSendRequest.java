package ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationSendRequest {

    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("time_to_live")
    @Expose
    private Integer notificationTimeToLive;

    public Integer getNotificationTimeToLive() {
        return notificationTimeToLive;
    }

    public void setNotificationTimeToLive(Integer notificationTimeToLive) {
        this.notificationTimeToLive = notificationTimeToLive;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
