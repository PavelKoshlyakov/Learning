package learn.java.t2_oop.lessons.t4_polymorphism;

public class Cat extends Animal {
    private String breed;
    public Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public void madness(){
        System.out.println("Тыгыдык-тыгыдык");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Мяу-мяу");
    }
}
