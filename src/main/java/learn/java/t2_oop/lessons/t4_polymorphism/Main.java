package learn.java.t2_oop.lessons.t4_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>(
                List.of(
                        new Dog("Шарик", 2, "Рыжий", "Овчарка"),
                        new Dog("Барбос", 5, "Чёрный", "Дворняга"),
                        new Dog("Пухля", 1, "Палевый", "Шпиц")
                )
        );

        ArrayList<Cat> cats = new ArrayList<>(
                List.of(
                    new Cat("Мурка", 8, "Белый", "Дворовая"),
                    new Cat("Рыжик", 2, "Рыжий", "Дворовая"),
                    new Cat("Винсент", 10, "Серый", "Британец")
                )
        );

//        printCat(cats);
//        printDog(dogs);

//        printInfo(cats);
//        printInfo(dogs);
//
//        printInfo(dogs);
//        makeOlder(dogs);
//        printInfo(dogs);

        ArrayList<Animal> list = new ArrayList<>(dogs);
        list.addAll(cats);
//        printInfo(list);

        //Вывести только собак
        for (Animal animal : list) {
            if (animal instanceof Dog) System.out.println(animal);
            if (animal instanceof Dog) ((Dog) animal).bringStick();
        }

    }

    public static void printInfo(ArrayList<Animal> animals){
        for (Animal animal : animals) {
            System.out.println(animal);
//            animal.call();
        }
    }

    public static void makeOlder(Animal animal){
        animal.makeOlder();
    }

//    public static void printDog(ArrayList<Dog> dogs){
//        for (Dog dog : dogs) {
//            System.out.println(dog);
//        }
//    }
//
//    public static void printCat(ArrayList<Cat> cats){
//        for (Cat cat : cats) {
//            System.out.println(cat);
//        }
//    }
}
