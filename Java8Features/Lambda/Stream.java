package LearnJava.Java8Features.Lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qimingzhang on 2017/5/2.
 */
public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);

        System.out.println(list.parallelStream().distinct().count());
    }
}
