package LearnJava.Collections;

/**
 * Created by qimingzhang on 2017/4/30.
 */
public class StringTest {
    public static void main(String[] args) {
        String qiming = "qiming";
        String yiming = "yiming";
        CharSequence charSequence = "CharSequence";
        String concatString = qiming.concat(" zhang");
        System.out.println(concatString);
        System.out.println(qiming.contains(""));
//        charsequence interface!!!
//        CharSequence与String都能用于定义字符串，但CharSequence的值是可读可写序列，而String的值是只读序列。
        /*int indexOf(int ch)   返回指定字符在此字符串中第一次出现处的索引。
        int indexOf(int ch, int fromIndex) 从指定的索引开始搜索，返回在此字符串中第一次出现指定字符处的索引。
        int indexOf(String str) 返回第一次出现的指定子字符串在此字符串中的索引。
        int indexOf(String str, int fromIndex) 从指定的索引处开始，返回第一次出现的指定子字符串在此字符串中的索引。*/
        System.out.println(qiming.indexOf('q'));

        String replaceString = qiming.replace("qiming", "yiming");
        System.out.println(replaceString);

        charSequence = qiming.subSequence(0, qiming.length());
        System.out.println(charSequence.toString().charAt(0));
    }
}
