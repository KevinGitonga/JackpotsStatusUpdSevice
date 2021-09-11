
package ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

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
    @SerializedName("county_name")
    @Expose
    private String countyName;
    @SerializedName("jackpot_category_name")
    @Expose
    private String jackpotCategoryName;
    @SerializedName("number_of_games")
    @Expose
    private Integer numberOfGames;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("provider")
    @Expose
    private Integer provider;
    @SerializedName("jackpot_type")
    @Expose
    private String jackpotType;
    @SerializedName("jackpot_site_url")
    @Expose
    private String jackpotSiteUrl;

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

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getJackpotCategoryName() {
        return jackpotCategoryName;
    }

    public void setJackpotCategoryName(String jackpotCategoryName) {
        this.jackpotCategoryName = jackpotCategoryName;
    }

    public Integer getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(Integer numberOfGames) {
        this.numberOfGames = numberOfGames;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getProvider() {
        return provider;
    }

    public void setProvider(Integer provider) {
        this.provider = provider;
    }

    public String getJackpotType() {
        return jackpotType;
    }

    public void setJackpotType(String jackpotType) {
        this.jackpotType = jackpotType;
    }

    public String getJackpotSiteUrl() {
        return jackpotSiteUrl;
    }

    public void setJackpotSiteUrl(String jackpotSiteUrl) {
        this.jackpotSiteUrl = jackpotSiteUrl;
    }

}
