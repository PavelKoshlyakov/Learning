package learn.java.oop.lessons.t2_incapsulation;

public class HumanSimple {
    String name;
    String surname;
    int age;

    /**Количество патронов*/
    int numberPatrons;

    public HumanSimple(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberPatrons = 15;
    }

    /**Метод выстрела*/
    void shoot(){
        if (numberPatrons > 0){
            numberPatrons--;                //Уменьшение количество оставшихся патронов
            System.out.println("Bang!!!");
            System.out.println("Осталось " + numberPatrons + " патронов.");
            System.out.println();
        } else {
            System.out.println("Обойма пуста, стрелять нечем");
        }

    }

    /**Перезарядка*/
    void reload(){
        numberPatrons = 15;
    }
    void printInfo(){
        System.out.println("Имя: " + name + ", фамилия: " + surname + ", возраст: " + age);
    }
}
