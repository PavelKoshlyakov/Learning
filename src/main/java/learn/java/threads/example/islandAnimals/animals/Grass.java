package learn.java.threads.example.islandAnimals.animals;

import learn.java.threads.example.islandAnimals.Side;
import learn.java.threads.example.islandAnimals.animals.*;

import java.util.concurrent.ThreadLocalRandom;

public class Grass {

    private final int weight = 1;
    private final int maxQuantityByCell = 200;

    public int getWeight() {
        return weight;
    }

    public int getMaxQuantityByCell() {
        return maxQuantityByCell;
    }
}
