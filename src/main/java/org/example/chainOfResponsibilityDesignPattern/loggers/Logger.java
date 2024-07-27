package org.example.chainOfResponsibilityDesignPattern.loggers;

public abstract class Logger {

    public static int ERROR = 3;
    public static int INFO = 2;
    public static int DEBUG = 1;

    private Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int log, String message) {
        if(nextLogger != null) nextLogger.logMessage(log, message);
    }
}
