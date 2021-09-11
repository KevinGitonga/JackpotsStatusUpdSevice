
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Status implements Serializable
{

    @SerializedName("long")
    @Expose
    private String _long;
    @SerializedName("short")
    @Expose
    private String _short;
    @SerializedName("elapsed")
    @Expose
    private Integer elapsed;
    private final static long serialVersionUID = 1231035941649637505L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param elapsed
     * @param _long
     * @param _short
     */
    public Status(String _long, String _short, Integer elapsed) {
        super();
        this._long = _long;
        this._short = _short;
        this.elapsed = elapsed;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public Integer getElapsed() {
        return elapsed;
    }

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

}
