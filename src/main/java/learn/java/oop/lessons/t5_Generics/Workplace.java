package learn.java.oop.lessons.t5_Generics;

import java.util.ArrayList;

//Workplace - название класса
//<T> - Какой-то тип данных, пока не известно какой. Значение в треугольных скобках правильно называется Diamond синтаксис

/**Рабочее место*/
public class Workplace <T> {
    ArrayList<T> personal;      //Какой тип данных будет объявлен для класса, такой же тип устанавливаем коллекции

    public Workplace(ArrayList<T> personal){
        this.personal = personal;
    }
    public Workplace(){
        this.personal = new ArrayList<>();
    }

    public void add(T worker){
        personal.add(worker);
    }

    /**Получение сотрудника по номеру*/
    public T getWorkerByNumber(int number){
        return personal.get(number);
    }

//    public void printInfo(){
//        for (T t : personal) {
//            System.out.println(t.getName());
//        }
//    }
}
