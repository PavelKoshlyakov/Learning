package learn.java.oop.examples.learning;

public class Human {
    //Поля класса
    String name = "";
    String surname = "";
    int age = 0;

    //Конструктор класса
    Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Методы класса
    void printInfo(){
        System.out.println(name + " " + surname + " " + age + " лет");
    }

    boolean isOlder(Human human){
//        if (age > human.age) return true;
//        else return false;
        return age > human.age;
    }
}
