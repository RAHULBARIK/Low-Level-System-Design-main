package org.example.LLDQuestion.LoggerSystemWithChainOfResponsibilityPrinciple;

public class ErrorLogProcessor extends  LogProcessor {
    public ErrorLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("DEBUG: "+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
