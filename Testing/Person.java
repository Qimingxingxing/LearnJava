package LearnJava.Testing;

/**
 * Created by qimingzhang on 2017/5/3.
 */
public class Person {
    private final String name;
    private final boolean happy;

    public Person(String name, boolean happy) {
        this.name = name;
        this.happy = happy;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }
}
