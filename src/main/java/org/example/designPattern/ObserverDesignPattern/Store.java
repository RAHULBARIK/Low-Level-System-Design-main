package org.example.designPattern.ObserverDesignPattern;

import org.example.designPattern.ObserverDesignPattern.Observable.IphoneObservable;
import org.example.designPattern.ObserverDesignPattern.Observable.StocksObservable;
import org.example.designPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import org.example.designPattern.ObserverDesignPattern.Observer.MobileAlertObserveImpl;
import org.example.designPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){

        StocksObservable stocksObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new MobileAlertObserveImpl("8455082439",stocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("rahulbarik764@gmail.com",stocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("rahulbarik7888@gmail.com",stocksObservable);

        stocksObservable.add(observer1);
        stocksObservable.add(observer2);
        stocksObservable.add(observer3);
        stocksObservable.setStockCount(10);
        stocksObservable.setStockCount(100);

        stocksObservable.remove(observer3);
        stocksObservable.sold(110);
        stocksObservable.setStockCount(15);




    }
}
