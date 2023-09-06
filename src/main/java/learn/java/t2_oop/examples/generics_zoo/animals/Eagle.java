package learn.java.t2_oop.examples.generics_zoo.animals;

public class Eagle extends Animal{
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Eagle{" + super.toString() + "}";
    }
}
