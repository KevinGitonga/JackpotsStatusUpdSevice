package ke.co.ipandasoft.jackpotsupdservice.utils;

import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.JpWinLostDataModel;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.Fixture;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static ke.co.ipandasoft.jackpotsupdservice.JackpotsStatusUpdService.gson;
import static ke.co.ipandasoft.jackpotsupdservice.JackpotsStatusUpdService.logger;

public class WinCalcUtil {

    public static final JpWinLostDataModel checkWinners(List<Fixture>  fixtureList){
        Integer winsNumber = 0;
        Integer lostNumber = 0;
        Integer cancelledNumber =0;

        for (int i = 0; i < fixtureList.size(); i++) {
            if (fixtureList.get(i).getFixtureAiTipStatus().equals(ApiConstants.MATCH_WON)){
                winsNumber++;
            }
            else if (fixtureList.get(i).getFixtureAiTipStatus().equals(ApiConstants.MATCH_LOST)){
                lostNumber++;
            }
            else if (fixtureList.get(i).getFixtureAiTipStatus().equals(ApiConstants.MATCH_CANCELLED)){
                cancelledNumber++;
            }
        }

        JpWinLostDataModel jpWinLostDataModel = new JpWinLostDataModel();
        jpWinLostDataModel.setWonFixtures(winsNumber.toString());
        jpWinLostDataModel.setLostFixtures(lostNumber.toString());
        jpWinLostDataModel.setCancelledFixtures(cancelledNumber.toString());

        return jpWinLostDataModel;
    }

    public static final Fixture getLastPlayFixture(List<Fixture> fixtureList){

        Collections.sort(fixtureList, (m1, m2) -> {
            SimpleDateFormat apiDateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //2024-02-28 20:30:00
            Date parsedHomeDate = null;
            Date parsedAwayDate = null;

            try {
                parsedHomeDate = apiDateFormatter.parse(m1.getFixtureDate()+" "+m1.getFixtureEatTime());
                parsedAwayDate = apiDateFormatter.parse(m2.getFixtureDate()+" "+m2.getFixtureEatTime());
            }catch (Exception exception){
                logger.info("FIXTURE PARSE ERROR"+gson.toJson(m1));
                logger.error(exception.getMessage());
            }
            return parsedHomeDate.compareTo(parsedAwayDate);
        });

        logger.error("SORTED FIXTURES LIST" + gson.toJson(fixtureList));
        return fixtureList.get(fixtureList.size()-1);
    }

    public static final Boolean checkNoGamePending(List<Fixture> fixtureList){

        Integer pendingMatchesCount = 0;

        for (int x = 0; x<fixtureList.size(); x++){
            if (fixtureList.get(x).getFixtureAiTipStatus().equals(ApiConstants.MATCH_STATUS_PENDING)){
                pendingMatchesCount++;
            }
        }

        if (pendingMatchesCount == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
