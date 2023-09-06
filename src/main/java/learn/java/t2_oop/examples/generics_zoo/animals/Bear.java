package learn.java.t2_oop.examples.generics_zoo.animals;

public class Bear extends Animal{
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Bear{" + super.toString() + "}";
    }
}
