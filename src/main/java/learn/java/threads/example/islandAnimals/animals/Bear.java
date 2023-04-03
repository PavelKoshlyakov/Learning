package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;

import java.util.concurrent.ThreadLocalRandom;

public class Bear extends Animal{

    public Bear() {
        super(Kind.BEAR);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3B";
    }

}
