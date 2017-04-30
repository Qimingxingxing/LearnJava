package LearnJava.Polymorphism;

/**
 * Created by qimingzhang on 2017/4/30.
 */
public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void say(){
        System.out.println("mewo");
    }
    public static void main(String[] args) {
        Animal cat = new Cat("mm");
//        cat.say(); if Animal class does not have say method, this will be wrong!!!
        cat.say(); // this will print out mewo, rather than hello!!!
    }
}
