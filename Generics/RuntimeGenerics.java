package LearnJava.Generics;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * Created by qimingzhang on 2017/5/9.
 */
public class RuntimeGenerics<T> {
    private final T value;

    public T getValue() {
        return value;
    }

    public RuntimeGenerics(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        RuntimeGenerics<Number> runtimeGenerics = new RuntimeGenerics<>(10);
        System.out.println(runtimeGenerics.getValue().getClass());
        ArrayList<Integer> intArray = new ArrayList<>();
        ArrayList<String> strArray = new ArrayList<>();
        System.out.println(intArray.getClass());
        ArrayList<Integer> arrayList3=new ArrayList<Integer>();
        arrayList3.add(1);//这样调用add方法只能存储整形，因为泛型类型的实例为Integer
        try {
            arrayList3.getClass().getMethod("add", Object.class).invoke(arrayList3, "asd");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        for (int i=0;i<arrayList3.size();i++) {
            System.out.println(arrayList3.get(i));
        }
    }
}
