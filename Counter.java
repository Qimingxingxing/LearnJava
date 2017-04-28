package MultiThread;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class Counter {
    long count = 0;
    //同步实例方法
    public synchronized void add() {
        count++;
        try {
            Thread. sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out.println(Thread. currentThread().getName() + "--" + count);
    }

    static class CounterThread extends Thread {
        protected Counter counter = null;

        public CounterThread(Counter counter) {
            this.counter = counter;
        }

        public void run() {
            //用多个线程调用同步实例方法
            for (int i = 0; i < 5; i++) {
                counter.add();
            }
        }
    }
    public static void main(String[] args) {
        //构造一个含同步方法的对象实例
        Counter counter = new Counter();
        Thread threadA = new CounterThread( counter);
        Thread threadB = new CounterThread( counter);
        threadA.start();
        threadB.start();
    }
}
