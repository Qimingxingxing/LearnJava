package LearnJava.Testing;

/**
 * Created by qimingzhang on 2017/4/30.
 */
public class ReverseWord {
    public String reverseWords(String s) {
        if(s == null ) return null;
        s = s.trim();
        String[] strArray = s.split("\\s+");
        strArray = reverseArray(strArray);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArray.length; i++){
            sb.append(strArray[i]);
            if(i != strArray.length - 1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    private String[] reverseArray(String[] array){
        String[] arrayCopy = new String[array.length];
        for(int i = 0; i < array.length; i ++){
            arrayCopy[i] = array[array.length - i - 1];
        }
        return arrayCopy;
    }

    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseWords("world    a"));
    }
}
