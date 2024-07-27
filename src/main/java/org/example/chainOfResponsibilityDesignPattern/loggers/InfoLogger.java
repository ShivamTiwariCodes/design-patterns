package org.example.chainOfResponsibilityDesignPattern.loggers;

public class InfoLogger extends Logger {
    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void logMessage(int log, String message) {
        if(log == Logger.INFO) {
            System.out.println("INFO :: " + message);
        } else {
            super.logMessage(log, message);
        }
    }
}
