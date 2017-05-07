package LearnJava.Polymorphism;

/**
 * Created by qimingzhang on 2017/5/7.
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog("1"), new Dog("2")};
        Animal[] animals = dogs;
        Dog dog = dogs[0];
        animals[0] = new Cat("cat1");
    }
}
