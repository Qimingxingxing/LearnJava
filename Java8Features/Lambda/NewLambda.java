package LearnJava.Java8Features.Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qimingzhang on 2017/5/2.
 */

//http://blog.csdn.net/renfufei/article/details/24600507
public class NewLambda {
    @FunctionalInterface
    interface LambdaInterface{
        void method();
    }
    public static void main(String[] args) {
        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        }).start();

// 1.2使用 lambda expression
        new Thread(() -> System.out.println("Hello world !")).start();

// 2.1使用匿名内部类
        Runnable race1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

// 2.2使用 lambda expression
        Runnable race2 = () -> System.out.println("Hello world !");

// 直接调用 run 方法(没开新线程哦!)
        race1.run();
        race2.run();


//        排序集合
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};

// 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        Comparator<String> sortByNameLenght = (String s1, String s2) -> (s1.length() - s2.length());
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

        LambdaInterface lambdaInterface = () -> System.out.println("Lambda interface");
        lambdaInterface.method();

    }
}
