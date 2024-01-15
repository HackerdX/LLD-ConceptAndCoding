# OBSERVER PATTERN 
YT => https://www.youtube.com/watch?v=Ep9_Zcgst3U&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=5&ab_channel=Concept%26%26Coding

## DESIGN AMAZON LIKE NOTIFY ME BUTTON (ASKED IN WALMART)
1) Created a StockObservable, which has methods like add, remove, update and setStock getStock
2) Created a class of IphoneObservableImpl which will implement these methods and will notify the users through email and mobile about new stock availability.
3) Created an Observer interface (NotificationAlertObserver) which has method update.
4) Created two classes EmailAlertObserverImpl and MobileAlertObserverImpl which will implement that update method from NotificationAlertObserver.
5) Now main program creates object for StockObservable for Iphone Stock and NotificationAlertObserver for with 2 emails and 1 mobile user and sends the notification if the Iphone stock is available.
6) NOTE: 
   i)  NotificationAlertObserver is in HAS-A relationship with IPhoneObservableImpl and
   ii) StockObservable also is in HAS-A relationship with EmailAlertObserverImpl and MobileAlertObserverImpl