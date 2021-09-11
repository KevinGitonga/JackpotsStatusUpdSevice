package ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JpWinLostDataModel {
    @SerializedName("won_fixtures")
    @Expose
    private String wonFixtures;
    @SerializedName("lost_fixtures")
    @Expose
    private String lostFixtures;
    @SerializedName("cancelled_fixtures")
    @Expose
    private String cancelledFixtures;

    public String getWonFixtures() {
        return wonFixtures;
    }

    public void setWonFixtures(String wonFixtures) {
        this.wonFixtures = wonFixtures;
    }

    public String getLostFixtures() {
        return lostFixtures;
    }

    public void setLostFixtures(String lostFixtures) {
        this.lostFixtures = lostFixtures;
    }

    public String getCancelledFixtures() {
        return cancelledFixtures;
    }

    public void setCancelledFixtures(String cancelledFixtures) {
        this.cancelledFixtures = cancelledFixtures;
    }
}