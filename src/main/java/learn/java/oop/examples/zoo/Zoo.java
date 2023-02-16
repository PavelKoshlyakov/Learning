package learn.java.oop.examples.zoo;

import java.util.ArrayList;

public class Zoo {
    //Поля класса
    String name;
    ArrayList<Animal> animals = new ArrayList<>();

    //Конструктор класса
    Zoo(String name){
        this.name = name;
    }

    void addAnimal(Animal animal){
        animals.add(animal);
    }

    void printAllAnimals(){
//        for (int i = 0; i <animals.size(); i++){
//            HomeAnimal animal = animals.get(i);
//            System.out.println(animal.name + " " + animal.age + " " + animal.type);
//        }
    }

    int getQuantityAnimals(){
        return animals.size();
    }
}
