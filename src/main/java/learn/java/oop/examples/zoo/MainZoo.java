package learn.java.oop.examples.zoo;

import java.util.Scanner;

public class MainZoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int quantity = scanner.nextInt();
//        Zoo zoo = new Zoo("Центральный", quantity);

//        quantity = scanner.nextInt();
//        Zoo zoo1 = new Zoo("Верховный", quantity);
//
//        System.out.println(zoo.name + " " + zoo.quantity);
//        System.out.println(zoo1.name + " " + zoo1.quantity);

//        Zoo zoo = new Zoo("Центральный");
//        zoo.animals.add(new HomeAnimal("Лев", 5, "Млекопитающее"));
//        zoo.addAnimal(new HomeAnimal("Пума", 3, "Млекопитающее"));
//        zoo.addAnimal(new HomeAnimal("Игуана", 3, "Рептилия"));
//
//        zoo.printAllAnimals();
//        System.out.println(zoo.getQuantityAnimals());

        Animal animal = new Animal("Шарик", 7, "Собака");
        System.out.println("Возраст до: " + animal.getAge());
        animal.setAge(8);
        System.out.println("Возраст после: " + animal.getAge());
    }
}
