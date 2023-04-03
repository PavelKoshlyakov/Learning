package learn.java.oop.examples.generics_container.items;

/**Катер*/
public class Boat extends Item{
    /**Максимальная скорость*/
    private int maxSpeed;
    private String name;

    public Boat(int width, int height, int length, String name, int maxSpeed) {
        super(width, height, length);
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public Boat(int width, int height, int length) {
        super(width, height, length);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
