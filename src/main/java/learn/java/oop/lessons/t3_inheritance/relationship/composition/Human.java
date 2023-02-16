package learn.java.oop.lessons.t3_inheritance.relationship.composition;

import java.util.ArrayList;

/*
* Композиция - это строгий вид связи между классом и параметром.
* */
public class Human {
    String name;
    int age;
    Heart heart;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.heart = new Heart(6);  //Объект не может быть создан без создания сердца
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Имя: " + name + ", возраст: " + age);
    }

    private class Heart{
        int size;

        public Heart(int sizeHeart) {
            this.size = sizeHeart;
        }
    }
}

