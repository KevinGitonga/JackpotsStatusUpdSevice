
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Parameters implements Serializable
{

    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("date")
    @Expose
    private String date;
    private final static long serialVersionUID = 6282871722276890783L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameters() {
    }

    /**
     * 
     * @param date
     * @param timezone
     */
    public Parameters(String timezone, String date) {
        super();
        this.timezone = timezone;
        this.date = date;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
