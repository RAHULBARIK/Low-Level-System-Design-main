package org.example.LLDQuestion.LoggerSystemWithChainOfResponsibilityPrinciple;

public class LogProcessor {
    public static int INFO = 1 ;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(int logLevel ,String message){
        if(nextLogProcessor != null){
            System.out.println("Log: "+message);
        }
    }
}
