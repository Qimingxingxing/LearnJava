package LearnJava.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by qimingzhang on 2017/5/7.
 */
public class Removal {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("qiming");
        collection.add("zhang");
        collection.add("yiming");
//        for (String value: collection
//             ) {
//            System.out.println(collection.remove(value));
//        }
//        System.out.println(collection.size());

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(collection.size());
    }
}
