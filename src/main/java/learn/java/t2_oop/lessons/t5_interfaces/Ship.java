package learn.java.t2_oop.lessons.t5_interfaces;

public class Ship implements SwimmableInterface{
    @Override
    public void swim() {
        System.out.println("Корабль идёт по волнам");
    }
}
