package MultiThread.InnerClass;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class OuterClass {
    private String outerString;
    public void outerDisplay(){
        InnerClass innerClass = new InnerClass();
        innerClass.display();
    }
    public class InnerClass{
        public InnerClass() {
            outerString = "qiming";
        }
        public void display(){
            System.out.println(outerString);
        }
/*
        public static void staticInnerMethod(){
            inner class cannot have static method declaration
        }
*/
    }

    public static void main(String[] args) {
        OuterClass test = new OuterClass();
        OuterClass.InnerClass innerClass = test.new InnerClass();
        innerClass.display();
        test.outerDisplay();
    }
}
