package LearnJava.Libraries;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.Map;
import java.util.Set;

/**
 * Created by qimingzhang on 2017/5/6.
 */
public class GuavaTest {
    public static void main(String[] args) {
//        Immutable Collections
        Set<String> days = ImmutableSet.of("Sunday", "monday", "Friday");
        Map<String, Integer> primaryColors = ImmutableMap.<String, Integer>builder()
                .put("red", 0xFF0000)
                .put("yellow", 0xffff00)
                .put("Blue", 0x0000FF).build();

    }
}
