package learn.java.oop.lessons.t5_Generics.contrvar;

import learn.java.oop.lessons.t5_Generics.Devs;
import learn.java.oop.lessons.t5_Generics.Welder;
import learn.java.oop.lessons.t5_Generics.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//============================================= КОНТРВАРИАТИВНОСТЬ =====================================================
        //

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

        addDev(devs, new Devs("Емельян", 200000, "C++"));
        addDev(workers, new Devs("Емельян", 200000, "C++"));


//        ArrayList<Tester> testers = new ArrayList<>(
//                List.of(
//                        new Tester("Екатерина", "Java")
//                )
//        );
//        addDev(testers, new Devs("Виктор", 88000, "Java"));
    }

//    public static void addDev(ArrayList<Worker> workers, Worker worker){
//        workers.add(worker);
//    }

    public static void addDev(ArrayList<? super Devs> workers, Devs devs){
        workers.add(devs);
//        Worker worker = new Welder("Семён", 2);
//        workers.add(worker);        //Добавить можно только Devs или его наследников
    }
}
