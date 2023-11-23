package org.example.designPattern.ObserverDesignPattern.Observer;

import org.example.designPattern.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserveImpl implements NotificationAlertObserver{
    public String mobileNo;

    public StocksObservable stocksObservable;

    public MobileAlertObserveImpl(String mobileNo,StocksObservable stocksObservable){
        this.mobileNo = mobileNo;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        sendMessage(mobileNo,"Hurry Up product is in sale!!");
    }

    public void sendMessage(String mobileNo,String msg){
        System.out.println("message send to mobile No: "+mobileNo+" messageBody: "+msg);
    }
}
