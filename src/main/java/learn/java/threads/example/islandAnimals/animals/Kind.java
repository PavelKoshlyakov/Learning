package learn.java.threads.example.islandAnimals.animals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public enum Kind {
    BEAR(80, 3, 3, 50) {
        public HashMap<Kind, Integer> getRation() {
            HashMap<Kind, Integer> result = new HashMap<>();
            result.put(HORSE, 40);
            result.put(DUCK, 10);
            return result;
        }

        @Override
        public Animal born() {
            return new Bear();
        }
    },
    CATERPILLAR(0, 1000, 0, 0.01) {
        public HashMap<Kind, Integer> getRation() {
            HashMap<Kind, Integer> result = new HashMap<>();
//            result.put(GRASS, 100);
            return result;
        }

        @Override
        public Animal born() {
            return new Caterpillar();
        }
    },
    DUCK(0.15, 200, 4, 1) {
        public HashMap<Kind, Integer> getRation() {
            HashMap<Kind, Integer> result = new HashMap<>();
            result.put(CATERPILLAR, 90);
//            result.put(GRASS, 100);
            return result;
        }

        @Override
        public Animal born() {
            return new Duck();
        }
    },
    //    GRASS(0, 200, 0, 1){
//        public HashMap<Kind, Integer> getRation() {
//            return new HashMap<>();
//        }
//
//        @Override
//        public Animal born() {
//            return new Grass();
//        }
//    },
    HORSE(60, 20, 4, 400) {
        public HashMap<Kind, Integer> getRation() {
            HashMap<Kind, Integer> result = new HashMap<>();
//            result.put(GRASS, 100);
            return result;
        }

        @Override
        public Animal born() {
            return new Horse();
        }
    },
    WOLF(8, 3, 3, 50) {
        public HashMap<Kind, Integer> getRation() {
            HashMap<Kind, Integer> result = new HashMap<>();
            result.put(HORSE, 10);
            result.put(DUCK, 40);
            return result;
        }

        @Override
        public Animal born() {
            return new Wolf();
        }
    };

    private final double maxSatiety;
    private final int maxQuantityByCell;
    private final int speed;
    private final double weight;

    public Kind getRandomKind() {
        int random = ThreadLocalRandom.current().nextInt(Kind.values().length);
        return Kind.values()[random];
    }

    Kind(double maxSatiety, int maxQuantityByCell, int speed, double weight) {
        this.maxSatiety = maxSatiety;
        this.maxQuantityByCell = maxQuantityByCell;
        this.speed = speed;
        this.weight = weight;
    }

    public abstract HashMap<Kind, Integer> getRation();

    public abstract Animal born();

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public int getMaxQuantityByCell() {
        return maxQuantityByCell;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }


}
