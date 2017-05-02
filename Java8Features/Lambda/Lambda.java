package LearnJava.Java8Features.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by qimingzhang on 2017/5/2.
 */
public class Lambda {
    public static void main(String[] args) {
        Consumer consumer =  (value) -> System.out.println("hello world");
        consumer.accept(1);
    }
}
