package observable;

import Observer.Notification;

public interface StockItems {
    public void add(Notification ob);

    public void remove(Notification ob);

    public void notifyObservable();

    public void setStockCount(int newStockCount);

    public int getStockCount();



}
