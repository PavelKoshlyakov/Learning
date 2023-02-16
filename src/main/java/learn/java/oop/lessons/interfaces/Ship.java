package learn.java.oop.lessons.interfaces;

public class Ship implements SwimmableInterface{
    @Override
    public void swim() {
        System.out.println("Корабль идёт по волнам");
    }
}
