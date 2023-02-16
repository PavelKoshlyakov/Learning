package learn.java.oop.examples.dealers;

public class Car {
    private String brand;
    private String model;
    private String type;
    private String vin;
    private String color;
    private int cost;                           // стоимость
    private double engineVolume;                // объем двигателя

    public Car(String brand, String model, String type, String vin, String color, int cost, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.vin = vin;
        this.color = color;
        this.cost = cost;
        this.engineVolume = engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void printInfoCar() {
        System.out.println("Название бренда " + brand);
        System.out.println("Название модели " + model);
        System.out.println("Название кузова " + type);
        System.out.println("Индификационный номер " + vin);
        System.out.println("Цвет " + color);
        System.out.println("Цена " + cost);
        System.out.println("Объем двигателя " + engineVolume);
    }

}


