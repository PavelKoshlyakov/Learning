package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Гусеница
 */
public class Caterpillar extends Animal{

    public Caterpillar() {
        super(Kind.CATERPILLAR);
    }


    @Override
    public String toString() {
        return "\uD83D\uDC1B";
    }

}
