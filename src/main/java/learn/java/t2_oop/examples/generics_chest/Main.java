package learn.java.t2_oop.examples.generics_chest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreasureMap treasureMap = new TreasureMap("Остров невезения", 100);
        ArrayList<Island> islands = new ArrayList<>(
                List.of(
                        new Island("Проклятый остров", new Chest<Gold>(new Gold(10_000))),
                        new Island("Банановый остров", new Chest<Diamonds>(new Diamonds(5))),
                        new Island("Остров вечной бури", new Chest<Gold>(new Gold(1_000_000))),
                        new Island("Остров невезения", new Chest<Diamonds>(new Diamonds(15))),
                        new Island("Остров дъявола", new Chest<Gold>(null))
                )
        );

        Treasure treasure = null;
        for (Island island : islands){
            if (island.getName().equals(treasureMap.getNameIsland())){
                treasure = island.getChest().getSavingItem();
            }
        }

        if (treasure == null) System.out.println("Остров не существует");
        else System.out.println(treasure);

        Island islandMax = islands.get(0);
        for (Island island : islands){
            if (island.getChest().getSavingItem() != null && island.getChest().getSavingItem().getPrice() > islandMax.getChest().getSavingItem().getPrice()){
                islandMax = island;
            }
        }

        System.out.println("Остров с самым большим сокровищем: " + islandMax.getName());
    }
}
