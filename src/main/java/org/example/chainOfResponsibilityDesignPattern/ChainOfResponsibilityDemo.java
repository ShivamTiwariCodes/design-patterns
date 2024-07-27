package org.example.chainOfResponsibilityDesignPattern;

import org.example.chainOfResponsibilityDesignPattern.loggers.DebugLogger;
import org.example.chainOfResponsibilityDesignPattern.loggers.ErrorLogger;
import org.example.chainOfResponsibilityDesignPattern.loggers.InfoLogger;
import org.example.chainOfResponsibilityDesignPattern.loggers.Logger;

public class ChainOfResponsibilityDemo {


    public void run() {

        Logger logger = new ErrorLogger(new InfoLogger(new DebugLogger(null)));

        logger.logMessage(Logger.INFO, "This is Info Message.");
        logger.logMessage(Logger.DEBUG, "This is Debug Message.");
        logger.logMessage(Logger.ERROR, "This is Error Message.");
    }
}
