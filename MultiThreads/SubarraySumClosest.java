package LearnJava.MultiThreads;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by qimingzhang on 2017/5/14.
 */
public class SubarraySumClosest {
    class Pair {
        int sum;
        int index;
        public Pair(int s, int i) {
            sum = s;
            index = i;
        }
    }

    public int[] subarraySumClosest(int[] nums) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }

        int len = nums.length;
        Pair[] sums = new Pair[len+1];
        int sum = 0;
        sums[0] = new Pair(0, -1);
        for (int i = 1; i < len + 1; i++) {
            sum += nums[i - 1];
            sums[i] = new Pair(sum, i - 1);
        }
        Arrays.sort(sums, new Comparator<Pair>() {
            public int compare(Pair pair1, Pair pair2) {
                if(pair1.sum!=pair2.sum){
                    return pair1.sum - pair2.sum;
                } else{
                    return pair1.index - pair2.index;
                }
            }
        });
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < len + 1; i++) {
            if (ans > sums[i].sum - sums[i-1].sum) {
                ans = sums[i].sum - sums[i-1].sum;
                res[0] = sums[i-1].index + 1;
                res[1] = sums[i].index;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SubarraySumClosest subarraySumClosest = new SubarraySumClosest();
        int[] nums = new int[]{-3,1,1,-3,5};
        subarraySumClosest.subarraySumClosest(nums);
    }
}
