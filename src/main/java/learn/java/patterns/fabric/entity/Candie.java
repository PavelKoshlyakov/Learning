package learn.java.patterns.fabric.entity;

public class Candie extends Pastry{

    public Candie() { super(0.01, 3650);}

    public Candie(double weight, int daysToSave) {
        super(weight, daysToSave);
    }

    @Override
    public String toString() {
        return "Candie{" + super.toString() + "}";
    }
}
