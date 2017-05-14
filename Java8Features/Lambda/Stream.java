package LearnJava.Java8Features.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        list = list.stream().map(value -> value * value).filter(value -> value >5 ).collect(Collectors.toList());
        System.out.println(list);
    }
}
