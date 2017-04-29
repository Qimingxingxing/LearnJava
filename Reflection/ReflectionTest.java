package LearnJava.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class ReflectionTest {

    public static void main(String[] args) {
        //第一种方式：
        Class classc1 = null;
        try {
            classc1 = Class.forName("java.lang.Integer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//第二种方式：
//java中每个类型都有class 属性.
        Class classc2 = Integer.class;

//第三种方式：
//java语言中任何一个java对象都有getClass 方法
        Class classc3 = new Integer(1).getClass(); //c3是运行时类 (e的运行时类是Employee)


        Field[] fs = classc1.getDeclaredFields();

        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到此字符串中
        //最外边的public定义
        sb.append(Modifier.toString(classc1.getModifiers()) + " class " + classc1.getSimpleName() +"{\n");
        //里边的每一个属性
        for(Field field:fs){
            sb.append("\t");//空格
            sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性的修饰符，例如public，static等等
            sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字
            sb.append(field.getName()+";\n");//属性的名字+回车
        }

        sb.append("}");

        System.out.println(sb);

    }
}
