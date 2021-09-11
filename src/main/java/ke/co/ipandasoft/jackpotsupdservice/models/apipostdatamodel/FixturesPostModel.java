package ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixturesPostModel {
    @SerializedName("fixture_id")
    @Expose
    private String fixtureId;
    @SerializedName("fixture_date")
    @Expose
    private String fixtureDate;
    @SerializedName("fixture_utc_timestamp")
    @Expose
    private Integer fixtureUtcTimestamp;
    @SerializedName("fixture_eat_time")
    @Expose
    private String fixtureEatTime;
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
    private Integer leagueSeason;
    @SerializedName("fixture_league_id")
    @Expose
    private Integer fixtureLeagueId;
    @SerializedName("home_team_id")
    @Expose
    private Integer homeTeamId;
    @SerializedName("home_team_name")
    @Expose
    private String homeTeamName;
    @SerializedName("home_team_logo_url")
    @Expose
    private String homeTeamLogoUrl;
    @SerializedName("is_home_team_winner")
    @Expose
    private Boolean isHomeTeamWinner;
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
    private Boolean isAwayTeamWinner;
    @SerializedName("home_team_goals")
    @Expose
    private String homeTeamGoals;
    @SerializedName("away_team_goals")
    @Expose
    private String awayTeamGoals;
    @SerializedName("home_halftime_goals")
    @Expose
    private String homeHalftimeGoals;
    @SerializedName("away_halftime_goals")
    @Expose
    private String awayHalftimeGoals;
    @SerializedName("home_fulltime_goals")
    @Expose
    private String homeFulltimeGoals;
    @SerializedName("away_fulltime_goals")
    @Expose
    private String awayFulltimeGoals;
    @SerializedName("home_extratime_goals")
    @Expose
    private String homeExtratimeGoals;
    @SerializedName("away_extratime_goals")
    @Expose
    private String awayExtratimeGoals;
    @SerializedName("home_penalty_goals")
    @Expose
    private String homePenaltyGoals;
    @SerializedName("away_penalty_goals")
    @Expose
    private String awayPenaltyGoals;
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
    private Boolean isHeadDataUpdated;
    @SerializedName("is_fixture_standings_updated")
    @Expose
    private Boolean isFixtureStandingsUpdated;
    @SerializedName("fixture_ai_tip_status")
    @Expose
    private String fixtureAiTipStatus;

    public String getFixtureEatTime() {
        return fixtureEatTime;
    }

    public void setFixtureEatTime(String fixtureEatTime) {
        this.fixtureEatTime = fixtureEatTime;
    }

    public Boolean getHeadDataUpdated() {
        return isHeadDataUpdated;
    }

    public void setHeadDataUpdated(Boolean headDataUpdated) {
        isHeadDataUpdated = headDataUpdated;
    }

    public Boolean getFixtureStandingsUpdated() {
        return isFixtureStandingsUpdated;
    }

    public void setFixtureStandingsUpdated(Boolean fixtureStandingsUpdated) {
        isFixtureStandingsUpdated = fixtureStandingsUpdated;
    }

    public String getFixtureAiTipStatus() {
        return fixtureAiTipStatus;
    }

    public void setFixtureAiTipStatus(String fixtureAiTipStatus) {
        this.fixtureAiTipStatus = fixtureAiTipStatus;
    }

    public Boolean getHomeTeamWinner() {
        return isHomeTeamWinner;
    }

    public void setHomeTeamWinner(Boolean homeTeamWinner) {
        isHomeTeamWinner = homeTeamWinner;
    }

    public Boolean getAwayTeamWinner() {
        return isAwayTeamWinner;
    }

    public void setAwayTeamWinner(Boolean awayTeamWinner) {
        isAwayTeamWinner = awayTeamWinner;
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

    @SerializedName("home_win_odds")




    public String getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getFixtureDate() {
        return fixtureDate;
    }

    public void setFixtureDate(String fixtureDate) {
        this.fixtureDate = fixtureDate;
    }

    public Integer getFixtureUtcTimestamp() {
        return fixtureUtcTimestamp;
    }

    public void setFixtureUtcTimestamp(Integer fixtureTimestamp) {
        this.fixtureUtcTimestamp = fixtureTimestamp;
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

    public Integer getLeagueSeason() {
        return leagueSeason;
    }

    public void setLeagueSeason(Integer leagueSeason) {
        this.leagueSeason = leagueSeason;
    }

    public Integer getFixtureLeagueId() {
        return fixtureLeagueId;
    }

    public void setFixtureLeagueId(Integer fixtureLeagueId) {
        this.fixtureLeagueId = fixtureLeagueId;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
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

    public Boolean getIsHomeTeamWinner() {
        return isHomeTeamWinner;
    }

    public void setIsHomeTeamWinner(Boolean isHomeTeamWinner) {
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

    public Boolean getIsAwayTeamWinner() {
        return isAwayTeamWinner;
    }

    public void setIsAwayTeamWinner(Boolean isAwayTeamWinner) {
        this.isAwayTeamWinner = isAwayTeamWinner;
    }

    public String getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(String homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public String getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(String awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public String getHomeHalftimeGoals() {
        return homeHalftimeGoals;
    }

    public void setHomeHalftimeGoals(String homeHalftimeGoals) {
        this.homeHalftimeGoals = homeHalftimeGoals;
    }

    public String getAwayHalftimeGoals() {
        return awayHalftimeGoals;
    }

    public void setAwayHalftimeGoals(String awayHalftimeGoals) {
        this.awayHalftimeGoals = awayHalftimeGoals;
    }

    public String getHomeFulltimeGoals() {
        return homeFulltimeGoals;
    }

    public void setHomeFulltimeGoals(String homeFulltimeGoals) {
        this.homeFulltimeGoals = homeFulltimeGoals;
    }

    public String getAwayFulltimeGoals() {
        return awayFulltimeGoals;
    }

    public void setAwayFulltimeGoals(String awayFulltimeGoals) {
        this.awayFulltimeGoals = awayFulltimeGoals;
    }

    public Object getHomeExtratimeGoals() {
        return homeExtratimeGoals;
    }

    public void setHomeExtratimeGoals(String homeExtratimeGoals) {
        this.homeExtratimeGoals = homeExtratimeGoals;
    }

    public Object getAwayExtratimeGoals() {
        return awayExtratimeGoals;
    }

    public void setAwayExtratimeGoals(String awayExtratimeGoals) {
        this.awayExtratimeGoals = awayExtratimeGoals;
    }

    public Object getHomePenaltyGoals() {
        return homePenaltyGoals;
    }

    public void setHomePenaltyGoals(String homePenaltyGoals) {
        this.homePenaltyGoals = homePenaltyGoals;
    }

    public Object getAwayPenaltyGoals() {
        return awayPenaltyGoals;
    }

    public void setAwayPenaltyGoals(String awayPenaltyGoals) {
        this.awayPenaltyGoals = awayPenaltyGoals;
    }

}
