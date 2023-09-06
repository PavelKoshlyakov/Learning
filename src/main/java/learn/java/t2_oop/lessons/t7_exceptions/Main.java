package learn.java.t2_oop.lessons.t7_exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Human human = new Human("Иван", "Иванов", 40);
            human.setAge(-50);
            System.out.println(human);
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}


class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) throws Exception {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if (age < 0) throw new Exception("Значение возраста не может быть отрицательным!");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}