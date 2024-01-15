package com.ObservablePattern.Observable;

import com.ObservablePattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: observerList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0){
            notifySubscribers();
        }
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
