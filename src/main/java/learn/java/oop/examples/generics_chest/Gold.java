package learn.java.oop.examples.generics_chest;

public class Gold extends Treasure {
    public Gold(int quantity) {
        super(quantity);
    }

    @Override
    double getPrice() {
        return getQuantity();
    }

    @Override
    public String toString() {
        return "Gold{ price: " + getPrice() + "}";
    }
}
