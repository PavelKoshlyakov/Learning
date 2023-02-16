package com.company;

public class Human {

    //Поля класса
    private String name;
    private String surname;
    private int age;

    //Конструктор
    public Human(String surname, String name, int age){
        //Через this происходит обращение к полям класса
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
    }

    //Методы класса
    void printInfo(){
        System.out.println(surname + " " + name + " " + age + " лет.");
    }
}
