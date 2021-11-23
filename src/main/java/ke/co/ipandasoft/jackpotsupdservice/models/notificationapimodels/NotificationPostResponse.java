package ke.co.ipandasoft.jackpotsupdservice.models.notificationapimodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class NotificationPostResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("notification_title")
    @Expose
    private String notificationTitle;
    @SerializedName("notification_message")
    @Expose
    private String notificationMessage;
    @SerializedName("notification_timestamp")
    @Expose
    private String notificationTimestamp;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotificationTitle() {
        return notificationTitle;
    }

    public void setNotificationTitle(String notificationTitle) {
        this.notificationTitle = notificationTitle;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public String getNotificationTimestamp() {
        return notificationTimestamp;
    }

    public void setNotificationTimestamp(String notificationTimestamp) {
        this.notificationTimestamp = notificationTimestamp;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}