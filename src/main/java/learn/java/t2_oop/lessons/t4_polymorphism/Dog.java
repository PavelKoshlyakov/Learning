package learn.java.t2_oop.lessons.t4_polymorphism;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);    //Вызов конструктора родителя
        this.breed = breed;
    }

    public void bringStick(){
        System.out.println(getName() + " несёт палку хозяину");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("Гав-гав");
    }

//    public void call(String name){
//        System.out.println(name + ", " + name + ", " + name);
//    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                " breed='" + breed + '\'' +
                '}';
    }
}
