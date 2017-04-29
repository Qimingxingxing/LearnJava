package LearnJava.MultiThreads;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class TestPriority implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System. out.println(Thread.currentThread().getName() + "运行" + i);
        }
    }
    public static void main(String[] args) {
        TestPriority tp= new TestPriority();
        Thread t1= new Thread(tp,"A" );
        Thread t2= new Thread(tp,"B" );
        Thread t3= new Thread(tp,"C" );
        t1.setPriority(1);
        t2.setPriority(8);
        t3.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
    }
}