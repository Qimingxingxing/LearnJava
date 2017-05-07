package LearnJava.Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qimingzhang on 2017/5/7.
 */
public class HashSetGotcha {
    private static class Item{
        private String value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Item item = (Item) o;

            return value != null ? value.equals(item.value) : item.value == null;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }

        public void setValue(String value) {

            this.value = value;
        }

        public String getValue() {
            return value;

        }

        public Item(String value) {

            this.value = value;
        }
    }

    public static void main(String[] args) {
        Set<Item> set = new HashSet<>(2,1.0f);
        Item foo = new Item("foo");
        set.add(foo);
        System.out.println(set.contains(foo));
        System.out.println(set.contains(new Item("foo")));
        foo.setValue("foos");;
        System.out.println(set.contains(foo));
    }
}
