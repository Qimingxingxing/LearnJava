package MultiThread;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class Consumer extends Thread{
    Producer producer;
    public Consumer(Producer producer){
        this.producer=producer;
    }
    @Override
    public void run() {
        try {
            while (true) {
                producer.getMessage();
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Producer producer=new Producer();
        Consumer consumer=new Consumer(producer);
        producer.start();
        consumer.start();
    }
}