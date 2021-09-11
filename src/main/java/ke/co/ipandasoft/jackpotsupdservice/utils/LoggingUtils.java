package ke.co.ipandasoft.jackpotsupdservice.utils;

import org.apache.log4j.Logger;

public class LoggingUtils {

    public static final Logger createLoggerInstance(Class className){
        Logger logger = Logger.getLogger(className);
        return logger;
    }
}
