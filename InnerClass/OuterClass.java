package LearnJava.InnerClass;

import static com.sun.tools.classfile.AccessFlags.Kind.InnerClass;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class OuterClass {
    private String outerString;
    public void outerDisplay(){
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
    public static void outerStaticMethod(){

    }
    public class InnerClass{
        private int privateInt = 0;
        public InnerClass() {
            outerString = "qiming";
        }
        public void display(){
            System.out.println(outerString);
            outerStaticMethod();
        }
/*
        public static void staticInnerMethod(){
            inner class cannot have static method declaration
        }
*/
    }
    public static class InnerStaticClass{
        public InnerStaticClass() {
//            outerDisplay();
        }
    }
    public void display(){
        /* 外部类能直接访问静态内部类静态元素 */
        /* 静态内部类可以直接创建实例不需要依赖于外部类 */
        /* 非静态内部的创建需要依赖于外部类 */
        InnerClass inner = new OuterClass().new InnerClass();
        /* 非静态内部类的成员需要使用非静态内部类的实例访问 */
        InnerStaticClass innerStaticClass = new InnerStaticClass();
    }
    public static void main(String[] args) {
        OuterClass test = new OuterClass();
        OuterClass.InnerClass innerClass = test.new InnerClass();
        innerClass.display();
        test.outerDisplay();
        InnerStaticClass staticClass = new InnerStaticClass();
    }
}
