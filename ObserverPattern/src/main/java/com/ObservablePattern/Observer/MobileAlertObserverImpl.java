package com.ObservablePattern.Observer;

import com.ObservablePattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable){
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(userName, "product is in stock, hurry up!");
    }

    private void sendEmail(String userName, String msg) {
        System.out.println("message sent to: "+ userName);
    }
}
