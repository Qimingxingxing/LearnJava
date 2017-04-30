package LearnJava.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map1.put("qiming".substring(i), i);
        }
        for (int i = 0; i < 5; i++) {
            map2.putIfAbsent("yiming".substring(i), i);
        }
        map1.putAll(map2);
        map1.put(null,null);
        Set<Map.Entry<String, Integer>> set1 = map1.entrySet();
        for (Map.Entry set: set1) {
            System.out.println("key is "+ set.getKey() + ", value is "+ set.getValue());
        }
    }
}
