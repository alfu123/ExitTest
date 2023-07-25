import Observer.EmailObserver;
import Observer.MobileObserver;
import Observer.Notification;
import observable.IphoneStock;
import observable.StockItems;

public class Store {
    public static void main(String[] args) {
        StockItems iphoneStock=new IphoneStock();
        Notification obs1= new EmailObserver("abc@gmail.com",iphoneStock);
        Notification obs2= new EmailObserver("def@gmail.com",iphoneStock);
        Notification obs3=new MobileObserver("ghi@gmail.com",iphoneStock);
        iphoneStock.add(obs1);
        iphoneStock.add(obs2);
        iphoneStock.add(obs3);
        iphoneStock.setStockCount(10);

    }
}
