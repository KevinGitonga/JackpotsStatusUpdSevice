
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Goals implements Serializable
{

    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("away")
    @Expose
    private String away;
    private final static long serialVersionUID = -5424478516513312974L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Goals() {
    }

    /**
     * 
     * @param away
     * @param home
     */
    public Goals(String home, String away) {
        super();
        this.home = home;
        this.away = away;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

}
