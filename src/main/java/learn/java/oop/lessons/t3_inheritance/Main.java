package learn.java.oop.lessons.t3_inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5, "Чёрный", "Персидский");
        Dog dog = new Dog("Шарик", 3, "Чёрный", "Немецкая овчарка");
        cat.call();
        dog.call();
    }
}
