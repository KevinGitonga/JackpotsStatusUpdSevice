package ke.co.ipandasoft.jackpotsupdservice.utils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static ke.co.ipandasoft.jackpotsupdservice.JackpotsStatusUpdService.logger;

public class TimeProvider {

    public static final String parseEpochTime(long timeStamp){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm a");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EAT"));

        return dateFormat.format(new Date(timeStamp * 1000));
    }

    public static final ArrayList<String> getWeeksDates(){
        String apiDatePattern = "yyyy-MM-dd";
        ArrayList<String> weekDaysArray= new ArrayList<>();

        Date todayDate=new Date();
        Date wednesdayDate=addHoursToDateUtilDate(todayDate,24);
        Date thursdayDate=addHoursToDateUtilDate(todayDate,48);
        Date fridayDate=addHoursToDateUtilDate(todayDate,72);
        Date saturdayDate=addHoursToDateUtilDate(todayDate,96);
        Date sundayDate=addHoursToDateUtilDate(todayDate,120);
        Date mondayDate=addHoursToDateUtilDate(todayDate,144);
        Date teusdayDate=addHoursToDateUtilDate(todayDate,168);

        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(todayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(wednesdayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(thursdayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(fridayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(saturdayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(sundayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(mondayDate));
        weekDaysArray.add(new SimpleDateFormat(apiDatePattern).format(teusdayDate));

        return  weekDaysArray;
    }


    public static final Date addHoursToDateUtilDate(Date date, int hours) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, hours);
        return calendar.getTime();
    }

    public static final Boolean isJackpotCompleted(String matchDate,String matchTime){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm a");
        //dateFormat.setTimeZone(TimeZone.getTimeZone("EAT"));
        Date actualMatchDate=null;

        try{
            actualMatchDate=dateFormat.parse(matchDate+" "+matchTime);
        }
        catch (Exception ex){
            logger.info("ERROR PARSE DATE"+ex.getLocalizedMessage());
        }

        //String apiDatePattern = "yyyy-MM-dd HH:mm a";
        Date todaysDate=new Date();
        TimeZone.setDefault(TimeZone.getTimeZone("EAT"));

        logger.info("MATCH DATES"+actualMatchDate +" "+ todaysDate);
        logger.info("DATE TIMESTAMPS"+ actualMatchDate.getTime() +" "+ todaysDate.getTime());

        if(actualMatchDate.before(todaysDate)){
            logger.info("JACKPOT GAMES COMPLETED");
            return true;
        }
        else{
            logger.info("JACKPOT GAMES NOT COMPLETED");
            return false;
        }
    }

    public static final Boolean isJackpotCompletedTest(Integer matchUtcTimestamp){
        Long matchTimestamp = matchUtcTimestamp.longValue();
        Long localTimestamp = Instant.now().getEpochSecond();
        logger.info("LOCAL TIMESTAMP" +" "+ localTimestamp);
        logger.info("MATCH UTC TIMESTAMP"+" "+matchTimestamp);

        if(localTimestamp > matchTimestamp){
            logger.info("MATCH STARTED");
            return true;
        }
        else{
            logger.info("MATCH NOT STARTED");
            return false;
        }
    }

    public static Long getLocalizedTimestamp(){
        TimeZone timeZone = TimeZone.getTimeZone("EAT");
        Calendar calendar = Calendar.getInstance(timeZone);
        return calendar.getTimeInMillis();
    }
}
