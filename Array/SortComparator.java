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
        Pair pair1 = new Pair(3,2);
        Pair pair2 = new Pair(2,6);
        Pair pair3 = new Pair(2,4);
        Pair[] pairs = new Pair[3];
        pairs[0] = pair1;
        pairs[1] = pair2;
        pairs[2] = pair3;
        Arrays.sort(pairs, (o1, o2) -> {
            if(o1.first != o2.first)
                return o1.first - o2.first;
            else{
                return o1.second - o2.second;
            }
        });
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return 0;
            }
        });
        for (Pair pair: pairs){
            System.out.println(pair.second);
        }
    }
}
