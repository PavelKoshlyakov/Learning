package learn.java.oop.lessons.t5_Generics;

public class Welder extends Worker{
    private int category;

    public Welder(String name, int category) {
        super(name, 50_000);
        this.category = category;
    }
    public Welder(String name, double salary, int category) {
        super(name, salary);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
}
