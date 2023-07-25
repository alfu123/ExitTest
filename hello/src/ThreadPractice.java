import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPractice extends Thread{
    public int number;
    public ThreadPractice(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("\nTask"+number+"started");
        for (int i=number*100;i<number*100+99;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask"+number+"done");
    }
}
class ExecutorServiceRunner{
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        executorService.execute(new ThreadPractice(1));
        executorService.execute(new ThreadPractice(2));
        executorService.execute(new ThreadPractice(3));
        executorService.execute(new ThreadPractice(4));
        executorService.shutdown();
    }
}
