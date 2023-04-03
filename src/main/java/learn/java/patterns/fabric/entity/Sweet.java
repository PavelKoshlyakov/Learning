package learn.java.patterns.fabric.entity;

public class Sweet extends Pastry{
    public Sweet() {
        super(0.01, 365);
    }

    public Sweet(double weight, int daysToSave) {
        super(weight, daysToSave);
    }

    @Override
    public String toString() {
        return "Sweet{" + super.toString() + "}";
    }
}
