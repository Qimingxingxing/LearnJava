package LearnJava.Polymorphism;

/**
 * Created by qimingzhang on 2017/5/9.
 */
public class Bear extends Animal{
    private final String forest;
    private final int salmons;
    private final String sound;


    public Bear(String name, String forest, int salmons, String sound) {
        super(name);
        this.forest = forest;
        this.salmons = salmons;
        this.sound = sound;
    }

    @Override
    public int hashCode() {
        int result = forest != null ? forest.hashCode() : 0;
        result = 31 * result + salmons;
        result = 31 * result + (sound != null ? sound.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bear bear = (Bear) o;

        if (salmons != bear.salmons) return false;
        if (getName() != null ? !getName().equals(bear.getName()) : bear.getName() != null) return false;
        if (forest != null ? !forest.equals(bear.forest) : bear.forest != null) return false;
        return sound != null ? sound.equals(bear.sound) : bear.sound == null;
    }



    public static void main(String[] args) {
        Bear bear1 = new Bear("q","q", 1, "wang");
        Bear bear2 = new Bear("1","q", 1, "wang");
        System.out.println(bear1.equals(bear2));

    }
}


