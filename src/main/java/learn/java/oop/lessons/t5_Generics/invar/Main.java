package learn.java.oop.lessons.t5_Generics.invar;

import learn.java.oop.lessons.t5_Generics.Devs;
import learn.java.oop.lessons.t5_Generics.Welder;
import learn.java.oop.lessons.t5_Generics.Worker;
import learn.java.oop.lessons.t5_Generics.Workplace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//================================================ ИНВАРИАНТНОСТЬ ======================================================
        //В Java обобщённые классы являются инвариантными.
        //Например, ArrayList<Devs> можно присвоить только ArrayList<Devs>, но нельзя присвоить ArrayList<Worker>, даже
        //несмотря на то, что Worker является родителем для Devs. Также, нельзя присвоить ArrayList<Worker> коллекцию
        //ArrayList<Devs>

        ArrayList<Worker> workers = new ArrayList<>(
                List.of(
                        new Welder("Иван", 1),
                        new Devs("Пётр", 100000, "Java")
                )
        );
        ArrayList<Devs> devs = new ArrayList<>(
                List.of(
                        new Devs("Иван", "Java"),
                        new Devs("Пётр", 100000, "Java")
                )
        );

//        workers = devs;     //Свойство инвариантности
//        devs = workers;     //Ошибка - нарушение типобезопасности

        //Выход из ситуации с инвариантностью:
//        workers.addAll(devs);
//        double average = getAverageSalary(workers);
//        System.out.println(average);

        //Если выполнить следующую команду, то в список программистов мы попытаемся добавить сварщика.
        //Это нарушение типобезопасности. Именно поэтому, существует понятие инвариантности.
        //Инвариантность запретит передать список разработчиков, потому что ожидается список Worker'ов
//        addToList(devs, new Welder("Работничек", 1));


//        addToList(workers, new Welder("Работничек", 1));
    }

    public static double getAverageSalary(ArrayList<Worker> workers){
        double sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }

    public static void addToList(ArrayList<Worker> workers, Worker worker){
        workers.add(worker);
    }

}
