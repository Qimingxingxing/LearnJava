package LearnJava.Generics;

/**
 * Created by qimingzhang on 2017/4/29.
 */
//Wrong! since you are overriding a incompatible return type method!
//public class Subclass<T> extends Superclass<Integer> {
public class Subclass<T> extends Superclass<Integer> {
    private Integer genericVar;
    @Override
    public Integer getGenericVar() {
        return genericVar;
    }
    public static void main(String[] args) {

    }
}
