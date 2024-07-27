package org.example.chainOfResponsibilityDesignPattern.loggers;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void logMessage(int log, String message) {
        if(log == Logger.ERROR) {
            System.out.println("ERROR :: " + message);
        } else {
            super.logMessage(log, message);
        }
    }
}
