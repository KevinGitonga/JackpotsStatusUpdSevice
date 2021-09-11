
package ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JackpotsDataResponse {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("jackpot_start_date")
    @Expose
    private String jackpotStartDate;
    @SerializedName("jackpot_start_time")
    @Expose
    private String jackpotStartTime;
    @SerializedName("jackpot_status")
    @Expose
    private String jackpotStatus;
    @SerializedName("fixtures")
    @Expose
    private List<Fixture> fixtures = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getJackpotStartDate() {
        return jackpotStartDate;
    }

    public void setJackpotStartDate(String jackpotStartDate) {
        this.jackpotStartDate = jackpotStartDate;
    }

    public String getJackpotStartTime() {
        return jackpotStartTime;
    }

    public void setJackpotStartTime(String jackpotStartTime) {
        this.jackpotStartTime = jackpotStartTime;
    }

    public String getJackpotStatus() {
        return jackpotStatus;
    }

    public void setJackpotStatus(String jackpotStatus) {
        this.jackpotStatus = jackpotStatus;
    }

    public List<Fixture> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        this.fixtures = fixtures;
    }

}
