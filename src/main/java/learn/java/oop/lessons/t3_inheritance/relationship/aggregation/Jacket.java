package learn.java.oop.lessons.t3_inheritance.relationship.aggregation;

public class Jacket {
    private String brand;
    private String model;

    public Jacket(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
