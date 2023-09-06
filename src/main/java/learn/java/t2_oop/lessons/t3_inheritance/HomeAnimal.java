package learn.java.t2_oop.lessons.t3_inheritance;

//Абстрактный класс не может быть создан через оператор new
public abstract class HomeAnimal {
    private String name;
    private int age;
    private String color;

    //Если у родителя определён конструктор, каждый его потомок должен свой конструктор, в котором будет обращения к родительскому конструктору
    public HomeAnimal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }

    public void call(){
        System.out.print(name + " " + name + " " + name);
    }
}
