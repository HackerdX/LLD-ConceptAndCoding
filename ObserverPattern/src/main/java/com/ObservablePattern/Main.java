package com.ObservablePattern;

import com.ObservablePattern.Observable.IPhoneObservableImpl;
import com.ObservablePattern.Observable.StockObservable;
import com.ObservablePattern.Observer.EmailAlertObserverImpl;
import com.ObservablePattern.Observer.MobileAlertObserverImpl;
import com.ObservablePattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iPhoneStockObservable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iPhoneStockObservable);


        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStockCount(10);
        iPhoneStockObservable.setStockCount(0); // this will also not notify as the current stock is still 10.
        iPhoneStockObservable.setStockCount(100); // this will not notify as stock is available

    }
}