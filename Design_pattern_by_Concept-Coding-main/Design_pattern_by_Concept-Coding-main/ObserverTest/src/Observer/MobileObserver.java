package Observer;

import observable.StockItems;

public class MobileObserver implements Notification{
    String email;
    StockItems observable;

    public MobileObserver(String email, StockItems observable) {
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail("stock is present");
    }

    private void sendEmail(String msg) {
        System.out.println(msg);
    }
}
