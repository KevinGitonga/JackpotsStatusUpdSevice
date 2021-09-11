
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Teams implements Serializable
{

    @SerializedName("home")
    @Expose
    private Home home;
    @SerializedName("away")
    @Expose
    private Away away;
    private final static long serialVersionUID = -825315011182442691L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Teams() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Teams(Home home, Away away) {
        super();
        this.home = home;
        this.away = away;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

}
