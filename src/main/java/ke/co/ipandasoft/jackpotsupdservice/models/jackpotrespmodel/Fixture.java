
package ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fixture {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("fixture_id")
    @Expose
    private Integer fixtureId;
    @SerializedName("fixture_date")
    @Expose
    private String fixtureDate;
    @SerializedName("fixture_description")
    @Expose
    private String fixtureDescription;
    @SerializedName("status_name_long")
    @Expose
    private String statusNameLong;
    @SerializedName("status_name_short")
    @Expose
    private String statusNameShort;
    @SerializedName("fixture_league_name")
    @Expose
    private String fixtureLeagueName;
    @SerializedName("fixture_league_country")
    @Expose
    private String fixtureLeagueCountry;
    @SerializedName("fixture_league_logo_url")
    @Expose
    private String fixtureLeagueLogoUrl;
    @SerializedName("fixture_league_country_flag")
    @Expose
    private String fixtureLeagueCountryFlag;
    @SerializedName("league_round")
    @Expose
    private String leagueRound;
    @SerializedName("league_season")
    @Expose
    private String leagueSeason;
    @SerializedName("fixture_league_id")
    @Expose
    private Integer fixtureLeagueId;
    @SerializedName("home_team_id")
    @Expose
    private String homeTeamId;
    @SerializedName("home_team_name")
    @Expose
    private String homeTeamName;
    @SerializedName("home_team_logo_url")
    @Expose
    private String homeTeamLogoUrl;
    @SerializedName("is_home_team_winner")
    @Expose
    private Object isHomeTeamWinner;
    @SerializedName("away_team_id")
    @Expose
    private Integer awayTeamId;
    @SerializedName("away_team_name")
    @Expose
    private String awayTeamName;
    @SerializedName("away_team_logo_url")
    @Expose
    private String awayTeamLogoUrl;
    @SerializedName("is_away_team_winner")
    @Expose
    private Object isAwayTeamWinner;
    @SerializedName("home_team_goals")
    @Expose
    private Object homeTeamGoals;
    @SerializedName("away_team_goals")
    @Expose
    private Object awayTeamGoals;
    @SerializedName("home_halftime_goals")
    @Expose
    private Object homeHalftimeGoals;
    @SerializedName("away_halftime_goals")
    @Expose
    private Object awayHalftimeGoals;
    @SerializedName("home_fulltime_goals")
    @Expose
    private Object homeFulltimeGoals;
    @SerializedName("away_fulltime_goals")
    @Expose
    private Object awayFulltimeGoals;
    @SerializedName("home_extratime_goals")
    @Expose
    private Object homeExtratimeGoals;
    @SerializedName("away_extratime_goals")
    @Expose
    private Object awayExtratimeGoals;
    @SerializedName("home_penalty_goals")
    @Expose
    private Object homePenaltyGoals;
    @SerializedName("away_penalty_goals")
    @Expose
    private Object awayPenaltyGoals;
    @SerializedName("home_win_odds")
    @Expose
    private String homeWinOdds;
    @SerializedName("away_win_odds")
    @Expose
    private String awayWinOdds;
    @SerializedName("fixture_draw_odds")
    @Expose
    private String fixtureDrawOdds;
    @SerializedName("fixture_prediction")
    @Expose
    private String fixturePrediction;
    @SerializedName("is_hh_data_updated")
    @Expose
    private Boolean isHhDataUpdated;
    @SerializedName("is_fixture_standings_updated")
    @Expose
    private Boolean isFixtureStandingsUpdated;
    @SerializedName("fixture_ai_tip_status")
    @Expose
    private String fixtureAiTipStatus;
    @SerializedName("fixture_utc_timestamp")
    @Expose
    private String fixtureUtcTimestamp;
    @SerializedName("fixture_eat_time")
    @Expose
    private String fixtureEatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(Integer fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getFixtureDate() {
        return fixtureDate;
    }

    public void setFixtureDate(String fixtureDate) {
        this.fixtureDate = fixtureDate;
    }

    public String getFixtureDescription() {
        return fixtureDescription;
    }

    public void setFixtureDescription(String fixtureDescription) {
        this.fixtureDescription = fixtureDescription;
    }

    public String getStatusNameLong() {
        return statusNameLong;
    }

    public void setStatusNameLong(String statusNameLong) {
        this.statusNameLong = statusNameLong;
    }

    public String getStatusNameShort() {
        return statusNameShort;
    }

    public void setStatusNameShort(String statusNameShort) {
        this.statusNameShort = statusNameShort;
    }

    public String getFixtureLeagueName() {
        return fixtureLeagueName;
    }

    public void setFixtureLeagueName(String fixtureLeagueName) {
        this.fixtureLeagueName = fixtureLeagueName;
    }

    public String getFixtureLeagueCountry() {
        return fixtureLeagueCountry;
    }

    public void setFixtureLeagueCountry(String fixtureLeagueCountry) {
        this.fixtureLeagueCountry = fixtureLeagueCountry;
    }

    public String getFixtureLeagueLogoUrl() {
        return fixtureLeagueLogoUrl;
    }

    public void setFixtureLeagueLogoUrl(String fixtureLeagueLogoUrl) {
        this.fixtureLeagueLogoUrl = fixtureLeagueLogoUrl;
    }

    public String getFixtureLeagueCountryFlag() {
        return fixtureLeagueCountryFlag;
    }

    public void setFixtureLeagueCountryFlag(String fixtureLeagueCountryFlag) {
        this.fixtureLeagueCountryFlag = fixtureLeagueCountryFlag;
    }

    public String getLeagueRound() {
        return leagueRound;
    }

    public void setLeagueRound(String leagueRound) {
        this.leagueRound = leagueRound;
    }

    public String getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(String leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public Integer getFixtureLeagueId() {
        return fixtureLeagueId;
    }

    public void setFixtureLeagueId(Integer fixtureLeagueId) {
        this.fixtureLeagueId = fixtureLeagueId;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamLogoUrl() {
        return homeTeamLogoUrl;
    }

    public void setHomeTeamLogoUrl(String homeTeamLogoUrl) {
        this.homeTeamLogoUrl = homeTeamLogoUrl;
    }

    public Object getIsHomeTeamWinner() {
        return isHomeTeamWinner;
    }

    public void setIsHomeTeamWinner(Object isHomeTeamWinner) {
        this.isHomeTeamWinner = isHomeTeamWinner;
    }

    public Integer getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(Integer awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamLogoUrl() {
        return awayTeamLogoUrl;
    }

    public void setAwayTeamLogoUrl(String awayTeamLogoUrl) {
        this.awayTeamLogoUrl = awayTeamLogoUrl;
    }

    public Object getIsAwayTeamWinner() {
        return isAwayTeamWinner;
    }

    public void setIsAwayTeamWinner(Object isAwayTeamWinner) {
        this.isAwayTeamWinner = isAwayTeamWinner;
    }

    public Object getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(Object homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public Object getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(Object awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public Object getHomeHalftimeGoals() {
        return homeHalftimeGoals;
    }

    public void setHomeHalftimeGoals(Object homeHalftimeGoals) {
        this.homeHalftimeGoals = homeHalftimeGoals;
    }

    public Object getAwayHalftimeGoals() {
        return awayHalftimeGoals;
    }

    public void setAwayHalftimeGoals(Object awayHalftimeGoals) {
        this.awayHalftimeGoals = awayHalftimeGoals;
    }

    public Object getHomeFulltimeGoals() {
        return homeFulltimeGoals;
    }

    public void setHomeFulltimeGoals(Object homeFulltimeGoals) {
        this.homeFulltimeGoals = homeFulltimeGoals;
    }

    public Object getAwayFulltimeGoals() {
        return awayFulltimeGoals;
    }

    public void setAwayFulltimeGoals(Object awayFulltimeGoals) {
        this.awayFulltimeGoals = awayFulltimeGoals;
    }

    public Object getHomeExtratimeGoals() {
        return homeExtratimeGoals;
    }

    public void setHomeExtratimeGoals(Object homeExtratimeGoals) {
        this.homeExtratimeGoals = homeExtratimeGoals;
    }

    public Object getAwayExtratimeGoals() {
        return awayExtratimeGoals;
    }

    public void setAwayExtratimeGoals(Object awayExtratimeGoals) {
        this.awayExtratimeGoals = awayExtratimeGoals;
    }

    public Object getHomePenaltyGoals() {
        return homePenaltyGoals;
    }

    public void setHomePenaltyGoals(Object homePenaltyGoals) {
        this.homePenaltyGoals = homePenaltyGoals;
    }

    public Object getAwayPenaltyGoals() {
        return awayPenaltyGoals;
    }

    public void setAwayPenaltyGoals(Object awayPenaltyGoals) {
        this.awayPenaltyGoals = awayPenaltyGoals;
    }

    public String getHomeWinOdds() {
        return homeWinOdds;
    }

    public void setHomeWinOdds(String homeWinOdds) {
        this.homeWinOdds = homeWinOdds;
    }

    public String getAwayWinOdds() {
        return awayWinOdds;
    }

    public void setAwayWinOdds(String awayWinOdds) {
        this.awayWinOdds = awayWinOdds;
    }

    public String getFixtureDrawOdds() {
        return fixtureDrawOdds;
    }

    public void setFixtureDrawOdds(String fixtureDrawOdds) {
        this.fixtureDrawOdds = fixtureDrawOdds;
    }

    public String getFixturePrediction() {
        return fixturePrediction;
    }

    public void setFixturePrediction(String fixturePrediction) {
        this.fixturePrediction = fixturePrediction;
    }

    public Boolean getIsHhDataUpdated() {
        return isHhDataUpdated;
    }

    public void setIsHhDataUpdated(Boolean isHhDataUpdated) {
        this.isHhDataUpdated = isHhDataUpdated;
    }

    public Boolean getIsFixtureStandingsUpdated() {
        return isFixtureStandingsUpdated;
    }

    public void setIsFixtureStandingsUpdated(Boolean isFixtureStandingsUpdated) {
        this.isFixtureStandingsUpdated = isFixtureStandingsUpdated;
    }

    public String getFixtureAiTipStatus() {
        return fixtureAiTipStatus;
    }

    public void setFixtureAiTipStatus(String fixtureAiTipStatus) {
        this.fixtureAiTipStatus = fixtureAiTipStatus;
    }

    public String getFixtureUtcTimestamp() {
        return fixtureUtcTimestamp;
    }

    public void setFixtureUtcTimestamp(String fixtureUtcTimestamp) {
        this.fixtureUtcTimestamp = fixtureUtcTimestamp;
    }

    public String getFixtureEatTime() {
        return fixtureEatTime;
    }

    public void setFixtureEatTime(String fixtureEatTime) {
        this.fixtureEatTime = fixtureEatTime;
    }

}
