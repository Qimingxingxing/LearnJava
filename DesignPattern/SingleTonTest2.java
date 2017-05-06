package LearnJava.DesignPattern;

/**
 * Created by qimingzhang on 2017/5/6.
 */
/**
 * 饿汉式
 */

class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }

    public void info() {
        System.out.println("this is a test method...");
    }
}

/**
 * 客户端测试类
 *
 * @author Leo
 */
public class SingleTonTest2 {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        /**
         * 调用普通方法
         */
        s1.info();
        Singleton2 s2 = Singleton2.getInstance();
        /**
         * 运行结果为true，说明s1、s2这两个类变量都指向内存中的同一个对象
         */
        System.out.println(s1 == s2);
    }

}

//如果考虑多线程，那么getInstance()方法要加同步synchronized，这时饿汉式比懒汉式要好，尽管资源利用率要差，但是不用同步。