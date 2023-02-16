package learn.java.oop.lessons.t1_base;

public class VolleyballPlayer {
//=================================== Поля класса=============================================
    String name = "";
    String surname = "";
    int age = 0;
    String position = "";
//============================================================================================

//=================================== Конструктор класса =============================================
    public VolleyballPlayer(String name, String surname, int age, String position){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
    }

    //Перегруженный конструктор
    public VolleyballPlayer(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

//=================================== Методы класса =============================================
    public void printInfo(){
        System.out.println(surname + " " + name + " " + age + " " + position);
    }
}
