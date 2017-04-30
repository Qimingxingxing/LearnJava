package LearnJava.Collections;

import java.util.*;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class CollectionsExchange {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("China");
        list.add("Switzerland");
        list.add("Italy");
        list.add("France");
//        list -> array
        String [] countries = list.toArray(new String[list.size()]);
//        array -> list
        list = Arrays.asList(countries);
        HashMap<Integer, Integer> map = new HashMap<>();
//        Map转换为List
        List<Integer> mapValueList = new ArrayList<>(map.values());
//        Array转换为Set
        Set<String> set = new HashSet<String>(Arrays.asList(countries));
//        map -> set
        Set<Integer> targetSet = new HashSet<>(map.values());
    }
}
