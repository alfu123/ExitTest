package Observer;

import observable.StockItems;

public class EmailObserver implements Notification{

    public String email;
    public StockItems observable;

    public EmailObserver(String email, StockItems observable) {
        this.email=email;
        this.observable=observable;
    }
    @Override
    public void update() {
        sendEmail("stock is present");
    }
    public void sendEmail(String msg){
        System.out.println(msg);
    }
}
