package learn.java.t2_oop.lessons.t3_inheritance.origin;

public class Cat {
    String name;
    int age;
    String color;
    String breed;

    public Cat(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }

    public void madness(){
        System.out.println("Тыгыдык-тыгыдык");
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
