package LearnJava.MultiThreads;

import java.io.IOException;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        /*
        while(!Thread.currentThread().isInterrupted()){
            try{
                Thread.currentThread().interrupt();
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
                System.out.println(Thread.currentThread().getName());
                Thread.currentThread().interrupt();
            }
        }
        */
        try {
            new ExceptionTest().method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void method()throws Exception{
        throw new IOException();
    }
}
//http://www.cnblogs.com/onlywujun/p/3565082.html