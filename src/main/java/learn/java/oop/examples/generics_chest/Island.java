package learn.java.oop.examples.generics_chest;

public class Island {
    private String name;
    private Chest chest;

    public Island(String name, Chest chest) {
        this.name = name;
        this.chest = chest;
    }

    public String getName() { return name; }
    public Chest getChest() { return chest; }


}
