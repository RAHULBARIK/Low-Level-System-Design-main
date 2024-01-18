package org.example.LLDQuestion.LoggerSystemWithChainOfResponsibilityPrinciple;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(InfoLogProcessor.INFO,"just for info");
        logProcessor.log(InfoLogProcessor.DEBUG,"Debug this log");
        logProcessor.log(InfoLogProcessor.ERROR,"Exception handled here");
    }

}
