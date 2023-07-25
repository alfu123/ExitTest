package observable;

import Observer.Notification;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements StockItems{
    List<Notification> oblist=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(Notification ob) {
        oblist.add(ob);
    }

    @Override
    public void remove(Notification ob) {
        oblist.remove(ob);
    }

    @Override
    public void notifyObservable() {
        for (Notification ob:oblist){
            ob.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount==0){
            notifyObservable();
        }
        stockCount=newStockCount+stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
