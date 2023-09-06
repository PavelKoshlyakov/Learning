package learn.java.t2_oop.lessons.t3_inheritance.relationship.aggregation;

import java.util.ArrayList;

/*
1. Агрегация - это подвид ассоциации, выражающий слабую связь между классом и его параметром.
2. Параметр с видом связи "Агрегация" должен задаваться через сеттер. Нельзя принуждать заполнять такое поле.
*/
public class Human {
    private String name;
    private int age;
    private ArrayList<Human> friends = new ArrayList<>();   //Агрегация. Связь слабая. Друзья могут быть, а могут и не быть
    private Jacket jacket = null;

    //Если конструктор один и не имеет перегруженных вариантов, тогда данные агрегации в него передаваться не должны!
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
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

    public ArrayList<Human> getFriends() { return friends; }
    /**Добавление нового друга
     * @param newFriend Новый друг. Является объектом класса Human*/
    public void addNewFriend(Human newFriend) { friends.add(newFriend);}
    public void setFriends(ArrayList<Human> friends) { this.friends = friends; }

    public Jacket getJacket() { return jacket; }
    public void setJacket(Jacket jacket) { this.jacket = jacket; }

    public void printInfo(){
        System.out.println("Имя: " + name + ", возраст: " + age);
    }
}
