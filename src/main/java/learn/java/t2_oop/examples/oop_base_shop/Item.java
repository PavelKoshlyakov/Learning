package learn.java.t2_oop.examples.oop_base_shop;

public class Item {
    private String name;
    private double cost;

    private int minAgeToBuy;

    public Item(String name, double cost, int minAgeToBuy) {
        this(name, cost);
        this.minAgeToBuy = minAgeToBuy;
    }

    public Item(String name, double cost) {
        this.name = name;
        setCost(cost);          //Использование сеттера с уже написанной логикой
        minAgeToBuy = 6;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getCost() { return cost; }
    public void setCost(double cost) {
        if (cost < 0) return;
        this.cost = cost;
    }

    public int getMinAgeToBuy() { return minAgeToBuy; }
}
