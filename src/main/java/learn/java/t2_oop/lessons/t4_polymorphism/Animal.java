package learn.java.t2_oop.lessons.t4_polymorphism;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void call(){
        System.out.println(name + ", " + name + ", " + name);
    }

    public void makeOlder(){
        age++;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'';
    }
}
