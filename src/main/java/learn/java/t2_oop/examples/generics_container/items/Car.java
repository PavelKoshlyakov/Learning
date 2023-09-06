package learn.java.t2_oop.examples.generics_container.items;

public class Car extends Item{
    String brand;
    String model;

    public Car(int width, int height, int length, String brand, String model) {
        super(width, height, length);
        this.brand = brand;
        this.model = model;
    }

    public Car(int width, int height, int length) {
        super(width, height, length);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
