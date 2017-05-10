package LearnJava.Java8Features.Interface;

/**
 * Created by qimingzhang on 2017/5/2.
 */
public class Interface {
    public interface A {
        void doSomething();
        default void defaultMethod(){
            System.out.println("I'm a default method from A!");
        }
        static void staticMethod(){
            System.out.println("I'm a static method from A");
        }
        default void hello() {
            System.out.println("hello world from interface A");
        }

        default void foo() {
            System.out.println("foo from interface A");
        }
    }
    public interface B extends A {
        // redefine default method
        default void hello() {
            System.out.println("hello world from interface B");
            A.super.hello();
            this.foo();
            foo();
        }
        abstract void foo(); // redeclare!!!!!
    }

    public static class C implements B, A{
        @Override
        public void doSomething () {
            System.out.println("c object need do something");
        }

        @Override
        public void foo() {
            System.out.println("Foo method has been redeclared!!!");
        }
    }
    public static void main(String args[]) {
        A obj = new C();
        obj.hello();//调用B的方法
        obj.doSomething();
        A.staticMethod();
        obj.defaultMethod();
    }
}
