package LearnJava.Generics;

import java.util.ArrayList;

/**
 * Created by qimingzhang on 2017/5/9.
 */
public class Gotchas {
    public static void main(String[] args) {
        //
        ArrayList<String> arrayList1=new ArrayList();
        arrayList1.add("1");//编译通过
//        arrayList1.add(1);//编译错误
        String str1=arrayList1.get(0);//返回类型就是String

        ArrayList arrayList2=new ArrayList<String>();
        arrayList2.add("1");//编译通过
        arrayList2.add(1);//编译通过
        Object object=arrayList2.get(0);//返回类型就是Object

        new ArrayList<String>().add("11");//编译通过
//        new ArrayList<String>().add(22);//编译错误
//        String string=new ArrayList<String>().get(0);//返回类型就是String

        System.out.println(arrayList1 instanceof ArrayList<?>);
    }
}
