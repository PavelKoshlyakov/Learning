package learn.java.oop.lessons.interfaces;

public class Fish extends Animal implements SwimmableInterface{

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка с именем " + getName() + " плывёт");
    }
}
