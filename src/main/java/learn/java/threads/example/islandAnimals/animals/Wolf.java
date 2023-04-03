package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;

import java.util.concurrent.ThreadLocalRandom;

public class Wolf extends Animal{
    public Wolf() {
        super(Kind.WOLF);
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3A";
    }
}
