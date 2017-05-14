package LearnJava.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qimingzhang on 2017/5/13.
 */
public class SortComparator {
    public static class Pair{
        private final int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Pair pair1 = new Pair(1,2);
        Pair pair2 = new Pair(3,4);
        Pair pair3 = new Pair(5,6);
        Pair[] pairs = new Pair[3];
        pairs[0] = pair1;
        pairs[1] = pair2;
        pairs[2] = pair3;
        Arrays.sort(pairs, (o1, o2) -> o2.first - o1.first);

        for (Pair pair: pairs){
            System.out.println(pair.first);
        }
    }
}
