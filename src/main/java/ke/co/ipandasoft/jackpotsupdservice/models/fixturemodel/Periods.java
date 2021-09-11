
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Periods implements Serializable
{

    @SerializedName("first")
    @Expose
    private Object first;
    @SerializedName("second")
    @Expose
    private Object second;
    private final static long serialVersionUID = -2616515915416834251L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Periods() {
    }

    /**
     * 
     * @param first
     * @param second
     */
    public Periods(Object first, Object second) {
        super();
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

}
