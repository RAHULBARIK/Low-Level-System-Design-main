package org.example.designPattern.ObserverDesignPattern.Observer;

import org.example.designPattern.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StocksObservable stocksObservable;

    public  EmailAlertObserverImpl(String emailId,StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }


    @Override
    public void update() {
        //Some operational code
        sendMails(emailId,"Product is in stock hurry up!!");
    }

    private void sendMails(String emailId,String msg){
        System.out.println("mail sent to:"+emailId+" body: "+msg);

    }
}
