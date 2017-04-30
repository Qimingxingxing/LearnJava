package LearnJava.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by qimingzhang on 2017/4/29.
 */
public class HeightComparator {
    public static class Person implements Comparable{
        private final int height;
        private final String name;

        public Person(int height, String name) {
            this.height = height;
            this.name = name;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int compareTo(Object o) {
            return this.height - ((Person)o).getHeight();
            // increasing sequence
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person(175, "qiming");
        Person p2 = new Person(165,"yiming");
        Person p3 = new Person(160, "wandi");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        Collections.sort(personList);

        for(Person p: personList){
            System.out.println(p.getHeight());
        }
    }
}
