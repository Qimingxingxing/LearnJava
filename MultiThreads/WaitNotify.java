package LearnJava.MultiThreads;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class WaitNotify extends Thread{
    int total;
    @Override
    public void run(){
        synchronized (this){
            for(int i=0;i<100;i++){
                total=total+1;
            }
        }
    }
    public static void main(String[] args) {
        WaitNotify countThread=new WaitNotify();
        countThread.start();
        synchronized (countThread){
            System.out.println("等到countThread线程计算结束...");
            try {
                Thread.currentThread().interrupt();
                countThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("计算的结果是："+countThread.total);
        }
    }
}
