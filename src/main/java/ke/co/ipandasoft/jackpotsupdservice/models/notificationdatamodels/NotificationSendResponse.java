package ke.co.ipandasoft.jackpotsupdservice.models.notificationdatamodels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationSendResponse {

    @SerializedName("message_id")
    @Expose
    private Long messageId;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

}