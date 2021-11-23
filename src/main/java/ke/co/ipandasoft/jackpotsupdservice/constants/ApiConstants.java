package ke.co.ipandasoft.jackpotsupdservice.constants;

public class ApiConstants {

    //SPORTPESA API BASE URL
    public static final String API_FOOTBALL_BASE_URL="https://v3.football.api-sports.io/";

    //X-RAPID API KEY
    public static final String X_RAPID_API_KEY ="1e0d759f90685173d07bf58fd9b51bd7";

    //TIMEZONE_CONSTANT
    public static final String API_TIMEZONE_CONSTANT="Africa/Nairobi";

    //MY JACKPOTS DATA API AUTH
    public static final String JACKPOT_PREDICTIONS_NET_BASE_URL="https://adminpanel.soccerjackpottips.com/";

    //BEARER TOKEN
    public static final String BEARER_TOKEN_HEADER ="Bearer"+" ";

    //API DATA QUERY
    public static final String API_QUERIED_TYPE = "query_type";

    public static final String UPDATE_JACKPOT_STATUS_QUERY ="update_jackpot_status";

    //JACKPOTS API AUTH
    public static final String API_AUTH_USER_NAME ="apiuser";
    public static final String API_AUTH_PASSWORD  ="9NizntUu23JfgUU";
    public static final String PENDING_JACKPOT_STATUS ="jackpot_pending";
    //public static final String JACKPOTS_NET_API_TOKEN ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiaWF0IjoxNjIyNzA3NjAyLCJleHAiOjE2MjUyOTk2MDJ9.9zCOZ45MnQ-zoNdUFNoxrrTAbNhm2mfdkRYNYbU5VoI";


    //MATCH STATUSES
    public static final String MATCH_LOST="lost";
    public static final String MATCH_WON="won";
    public static final String MATCH_CANCELLED="canc";
    public static final String MATCH_STATUS_API_ERROR="errorgen";
    public static final String JACKPOT_ENDED="jackpot_ended";

    public static final String MATCH_STATUS_PENDING ="pending";

    //FIREBASE NOTIFICATION CONTANTS
    public static final String FCM_NET_BASE_URL ="https://fcm.googleapis.com/" ;
    public static final String FIREBASE_MESSAGING_API_KEY ="AAAAv9A6hv0:APA91bE1Vbm0VxigYT6O0dqgS1yWih9uHUU4jGii9m4g_9HJ7qp1sQt4116axyj3bMswYq4dOipswT_eBbMvzT-AsEELTW31ey0weeQ4xmCoW0YPb9EQVVbAVh3hq1rIsF8QkmYLkohFp89-Z_2Tk0YEx7__MPO4oA";

    //FCM MESSAGE BODY TEXT
    public static String JACKPOTS_CREATED_START_TAG ="\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6"+" "+ "Hello Jackpot punter";
    public static String JACKPOTS_CREATED_END_TAG ="all the best of luck.. Gamble responsibly"+" "+"\uD83C\uDFC6\uD83C\uDFC6\uD83C\uDFC6"+".";
    public static String JACKPOTS_RESULT_UPDATED_START_TAG ="\uD83D\uDCB0\uD83D\uDCB0\uD83D\uDCB0"+" "+ "Hello Jackpot punter";
    public static String JACKPOT_RESULT_UPDATED_END_TAG ="cheer's" + " "+ "\uD83D\uDCB0\uD83D\uDCB0\uD83D\uDCB0"+".";
    public static String JACKPOT_RESULT_UPDATED_MIDDLE_TAG ="we managed to win";
    public static String JACKPOT_RESULT_UPDATED_AND_TAG ="and lost";
    public static String JACKPOT_START_DATE_TAG="that started on";


    //FCM CHANNELS
    public static final String SJT_MAIN_NOTIFICATIONS_CHANNEL ="/topics/SJT_MAIN_NOTIFICATIONS";
}
