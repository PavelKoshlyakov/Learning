package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;

import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Animal{
    public Horse() {
        super(Kind.HORSE);
    }


    @Override
    public String toString() {
        return "\uD83D\uDC0E";
    }
}
