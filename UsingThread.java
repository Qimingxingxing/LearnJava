package MultiThread;

/**
 * Created by qimingzhang on 2017/4/25.
 */
public class UsingThread extends Thread{
    private volatile int count = 0;
    public UsingThread() {
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(count);
        }
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        UsingThread thread1 = new UsingThread();
        UsingThread thread2 = new UsingThread();
        thread1.start();
        thread2.start();

    }

}
