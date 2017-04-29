package LearnJava.Reflection;

import java.lang.reflect.Field;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Employee employee = new Employee("hi");
        Class c = employee.getClass();
        Field name = c.getDeclaredField("name");
        Object newEmployee = c.newInstance();
    }
}
