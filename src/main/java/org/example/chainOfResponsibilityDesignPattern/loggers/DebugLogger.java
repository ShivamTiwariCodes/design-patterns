package org.example.chainOfResponsibilityDesignPattern.loggers;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void logMessage(int log, String message) {
        if(log == Logger.DEBUG) {
            System.out.println("DEBUG :: " + message);
        } else {
            super.logMessage(log, message);
        }
    }
}
