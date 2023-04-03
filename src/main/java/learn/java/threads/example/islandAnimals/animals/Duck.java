package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;

import java.util.concurrent.ThreadLocalRandom;

public class Duck extends Animal{
    public Duck() {
        super(Kind.DUCK);
    }


    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }


}
