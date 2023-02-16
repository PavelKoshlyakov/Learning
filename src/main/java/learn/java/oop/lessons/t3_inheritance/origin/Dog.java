package learn.java.oop.lessons.t3_inheritance.origin;

public class Dog {
    String name;
    int age;
    String color;
    String breed;

    public Dog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public void getStick(){
        System.out.printf("%s с радостью несёт палку хозяину", name);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}
