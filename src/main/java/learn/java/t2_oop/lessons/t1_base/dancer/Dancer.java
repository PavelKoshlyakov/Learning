package learn.java.t2_oop.lessons.t1_base.dancer;

public class Dancer {
//===================== ПОЛЯ КЛАССА ================================
    String name;
    String surname;
    boolean isMan;
    int age;
    int height;
    char rank = 'N';

//===================== КОНСТРУКТОР(Ы) КЛАССА ==========================
    Dancer(String surname, String name, boolean isMan, int age, int height){
        this.name = name;
        this.surname = surname;
        this.isMan = isMan;
        this.age = age;
        this.height = height;
    }

    Dancer(String surname, String name, boolean isMan, int age, int height, char rank){
//        this.name = name;
//        this.surname = surname;
//        this.isMan = isMan;
//        this.age = age;
//        this.height = height;
        this(surname, name, isMan, age, height);    //Вызываем другой объявленный конструктор, чтобы сэкономить место
        this.rank = rank;
    }

//===================== МЕТОДЫ КЛАССА ================================
    void printInfo(){
        System.out.println(surname + " " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + (isMan ? "Мужской" : "Женский"));  //Тернарный
        System.out.println("Рост: " + height + " см.");
        System.out.println("Класс: " + rank);
        System.out.println();
    }
}
