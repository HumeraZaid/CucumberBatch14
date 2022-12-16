package utils;

import org.apache.log4j.*;

public class Log{

    // Initialize log4j logs
    public static Logger Log = Logger.getLogger(Log.class.getName());

    // Understand the scope
    // If my test case start
    // If my test case end
    // If any message I need in between

    public static void startTestCase(String testCaseName){
        Log.info("**");
        Log.info("**");
        Log.info("############   " + testCaseName + " ################");
        Log.info("**");
        Log.info("**");
    }

    public static void endTestCase(String testCaseName){
        Log.info("##################################");
        Log.info("##########################################");
        Log.info("############   " + testCaseName + " ################");
        Log.info("##########################");
        Log.info("##########################################");
    }

    // To print some text in between my code
    public static void info(String message){
        Log.info(message);
    }
    public static void warning(String warning){
        Log.info(warning);
    }
}
