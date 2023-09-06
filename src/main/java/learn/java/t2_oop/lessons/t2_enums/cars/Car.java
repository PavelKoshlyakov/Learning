package learn.java.t2_oop.lessons.t2_enums.cars;

public class Car {
    private Brands brand;
    private int cost;

    public Car(Brands brand, int cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public Brands getBrand() { return brand; }
    public void setBrand(Brands brand) { this.brand = brand; }

    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
}
