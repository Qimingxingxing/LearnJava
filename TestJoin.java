package MultiThread;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new JoinA(),"A");
        Thread t2 = new Thread(new JoinB(),"B");
        t1.start(); //main函数所在的主线程调用了实现了run()方法的JoinA子线程
        t1.join(); //主线程获得子线程的锁，阻塞直到子线程完成
        t2.start();
    }
}

class JoinA implements Runnable {
    private int i;
    @Override
    public void run() {
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + i + " ");
            i++;
        }
    }
}

class JoinB implements Runnable {
    private int i;
    @Override
    public void run() {
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + i + " ");
            i++;
        }
    }
}