package org.example.designPattern.ObserverDesignPattern.Observable;

import org.example.designPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StocksObservable {

    public List<NotificationAlertObserver> observers;


    public IphoneObservable(){
        observers = new ArrayList<>();
    }
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
          notifySubscribers();
        }
        stockCount = stockCount+newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void sold(int quantity){
        stockCount = stockCount-quantity;
    }
}
