package utils;

import constants.LogLevel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static constants.Constants.LOG_FILE_NAME;
import static utils.DateUtils.getCurrentDate;
import static utils.DateUtils.getCurrentTime;

public class Logger {

    private static Logger instance;
    protected String env = System.getProperty("user.dir");
    private static File logFile;

    private Logger () {
        this.createLogFile();
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    private void createLogFile() {
        File logsFolder = new File(env + '/' + "logs");
        if(!logsFolder.exists()){
            System.err.println("INFO: Creating new logs directory in " + env);
            logsFolder.mkdir();
        }
        String logname =  String.format("%s-%s.log", LOG_FILE_NAME, getCurrentDate());
        Logger.logFile = new File(logsFolder.getName(), logname);
        try{
            if(logFile.createNewFile()){
                System.err.println("INFO: Creating new log file");
            } else {
                clearLogFile();
            }
        }catch(IOException e){
            System.err.println("ERROR: Cannot create log file");
            System.exit(1);
        }
    }

    public static void info(String message) {
        log(LogLevel.INFO, message);
    }

    public static void error(String message) {
        log(LogLevel.ERROR, message);
    }

    private static void log(LogLevel logLevel, String message) {
        message = String.format("%s %s: %s\n", getCurrentTime(), logLevel, message);
        try{
            FileWriter out = new FileWriter(Logger.logFile, true);
            out.write(message.toCharArray());
            out.close();
        }catch(IOException e){
            System.err.println("ERROR: Could not write to log file");
        }
    }

    private static void clearLogFile() {
        try {
            FileWriter out = new FileWriter(Logger.logFile, false);
            out.write("");
            out.close();
        } catch (IOException e) {
            System.err.println("ERROR: Could not write to log file");
        }
    }
}
