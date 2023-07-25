/**
 * Two shoppers adding items to a shared notepad
 * data race something when multiple threads accessing the same memory for modification
 */
import java.util.concurrent.locks.*;
class Shopper extends Thread {

    static int garlicCount = 0;
    static Lock lock=new ReentrantLock();
    public void run() {
        for (int i=0; i<10_000_000; i++) {

                garlicCount++;
        }
    }
}

public class DataRaceDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread barron = new Shopper();
        Thread olivia = new Shopper();
        barron.start();
        olivia.start();
        barron.join();
        olivia.join();
        System.out.println("We should buy " + Shopper.garlicCount + " garlic.");
    }
}