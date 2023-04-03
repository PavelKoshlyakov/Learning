package learn.java.oop.examples.generics_chest;

/**Карта сокровищ*/
public class TreasureMap{
    /**Название острова*/
    final private String nameIsland;
    /**Количество шагов до зарытого сундука с сокровищами*/
    final private int countSteps;

    public TreasureMap(String nameIsland, int countSteps) {
        this.nameIsland = nameIsland;
        this.countSteps = countSteps;
    }

    public String getNameIsland() { return nameIsland; }

    public int getCountSteps() {
        return countSteps;
    }
}
