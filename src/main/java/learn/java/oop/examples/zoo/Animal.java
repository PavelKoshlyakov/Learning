package learn.java.oop.examples.zoo;

public class Animal {
    //Поля класса
    private String name = "";
    private int age = 0;
    private String type = "";

    //Конструктор класса
    Animal(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
