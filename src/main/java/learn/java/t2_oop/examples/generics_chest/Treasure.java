package learn.java.t2_oop.examples.generics_chest;

/**Сокровище*/
public abstract class Treasure {
    private int quantity;

    public Treasure(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() { return quantity; }

    abstract double getPrice();
}
