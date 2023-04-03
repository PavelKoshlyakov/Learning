package learn.java.patterns.fabric.entity;

public class Cake extends Pastry{
    public Cake() { super(2.0, 5);}

    public Cake(double weight, int daysToSave) {
        super(weight, daysToSave);
    }

    @Override
    public void biteOff() {
        this.weight -= this.maxWeight * (1/8.);
    }

    @Override
    public String toString() {
        return "Cake{" + super.toString() + "}";
    }
}
