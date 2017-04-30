package LearnJava.Polymorphism;

/**
 * Created by qimingzhang on 2017/4/30.
 */
public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(){
        System.out.println("hello");
    }
}
