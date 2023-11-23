package org.example.designPattern.ObserverDesignPattern.Observable;

import org.example.designPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStockCount();

    public void sold(int quantity);
}
