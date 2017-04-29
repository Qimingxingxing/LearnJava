package LearnJava.MultiThreads;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class Producer extends Thread {
    public static final int MAX_BOX_SIZE = 5;
    ArrayList<String> messageBox = new ArrayList<>();

    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void putMessage() throws InterruptedException {
        while (messageBox.size() == MAX_BOX_SIZE) {
            this.wait();//当箱子满后则进入等待
        }
        messageBox.add(new Date().toString());
        System.out.println("放入一条消息"+new Date().toString());
        this.notify();//放入消息后唤醒被锁住的线程（取消息线程）
    }

    public synchronized void getMessage() throws InterruptedException {
        while (messageBox.size() == 0) {
            this.wait();//当箱子空后进入等待
        }
        String message = messageBox.remove(messageBox.size() - 1);
        System.out.println("取出一条消息"+message);
        this.notify();//删除消息后唤醒被锁住的线程（放消息线程）
    }
}