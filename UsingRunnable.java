package MultiThread;

/**
 * Created by qimingzhang on 2017/4/25.
 */
public class UsingRunnable implements Runnable{
    private volatile int count = 0;
    public UsingRunnable() {
    }
    @Override
    public void run() {
        while (true){
            for (int i = 0; i < 5; i++) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Runnable run = new UsingRunnable();
        Thread thread1 = new Thread(run);
        Thread thread2 = new Thread(run);
        thread1.start();
        thread2.start();

    }
}
