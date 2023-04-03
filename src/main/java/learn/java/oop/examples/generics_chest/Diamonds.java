package learn.java.oop.examples.generics_chest;

/**Бриллианты*/
public class Diamonds extends Treasure {
    public Diamonds(int quantity) {
        super(quantity);
    }

    @Override
    double getPrice() {
        return getQuantity() * 1000;
    }

    @Override
    public String toString() {
        return "Diamonds{quantity: " + getQuantity() + ", price: " + getPrice() + "}";
    }
}
