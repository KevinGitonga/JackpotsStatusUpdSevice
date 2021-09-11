package ke.co.ipandasoft.jackpotsupdservice.utils;

import ke.co.ipandasoft.jackpotsupdservice.constants.ApiConstants;
import ke.co.ipandasoft.jackpotsupdservice.models.apipostdatamodel.JpWinLostDataModel;
import ke.co.ipandasoft.jackpotsupdservice.models.jackpotrespmodel.Fixture;

import java.util.List;

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
}
