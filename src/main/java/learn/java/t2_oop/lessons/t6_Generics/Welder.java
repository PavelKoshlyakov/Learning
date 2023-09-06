package learn.java.t2_oop.lessons.t6_Generics;

/**Сварщик*/
public class Welder extends Worker{
    /**Категория*/
    private int category;

    /**Конструктор со стандартной зарплатой*/
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

    @Override
    public String toString() {
        return "Welder{" +
                "category=" + category +
                '}';
    }
}
