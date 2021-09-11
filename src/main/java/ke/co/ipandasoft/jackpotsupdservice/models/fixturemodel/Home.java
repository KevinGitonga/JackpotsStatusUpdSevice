
package ke.co.ipandasoft.jackpotsupdservice.models.fixturemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Home implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("winner")
    @Expose
    private Boolean winner;
    private final static long serialVersionUID = 5666839247444770779L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Home() {
    }

    /**
     * 
     * @param winner
     * @param name
     * @param logo
     * @param id
     */
    public Home(Integer id, String name, String logo, Boolean winner) {
        super();
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.winner = winner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getWinner() {
        return winner;
    }

    public void setWinner(Boolean winner) {
        this.winner = winner;
    }

}
