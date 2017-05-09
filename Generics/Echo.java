package LearnJava.Generics;

/**
 * Created by qimingzhang on 2017/5/9.
 */
public class Echo<T> {
//    private static T staticVar;
    public T echo(T value){
        return value;
    }

    public Echo<?> echo(Echo<?> value){
        return value;
    }

    public static <U> void print(U value){
        System.out.println(value);
    }
//    public static T staticGeneric(T value){
//        return value;
//    }


    public static void main(String[] args) {
        Echo<Number> numberEcho = new Echo<>();
        numberEcho.echo(new Echo<Integer>());
        numberEcho.echo(10);
        print(1);
    }
}
