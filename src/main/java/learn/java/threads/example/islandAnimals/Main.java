package learn.java.threads.example.islandAnimals;

import learn.java.threads.example.islandAnimals.animals.Animal;
import learn.java.threads.example.islandAnimals.animals.Duck;
import learn.java.threads.example.islandAnimals.animals.Kind;
import learn.java.threads.example.islandAnimals.animals.Wolf;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        Island island = new Island();
//        Animal animal = island.getRandomAnimalFromCell(0, 0);
//        island.moveAnimal(animal, Side.getRandomSide());

        Island island = new Island();
        island.mealTime();
        System.out.println("-----");
        island.moveAnimals();
        island.multiply();

//        Wolf wolf = new Wolf();
//        Duck duck = new Duck();
//        System.out.println(wolf.eat(duck));
    }
}
