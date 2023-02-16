package learn.java.oop.lessons.t5_Generics.covar;

import learn.java.oop.lessons.t5_Generics.Devs;
import learn.java.oop.lessons.t5_Generics.Welder;
import learn.java.oop.lessons.t5_Generics.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//=============================================== КОВАРИАТИВНОСТЬ ======================================================
        // Ковариантность — это сохранение иерархии наследования исходных типов в производных типах в том же порядке.
        // Например, если Кошка — это подтип Животные, то Множество<Кошки> — это подтип Множество<Животные>.

        ArrayList<Worker> workers = new ArrayList<>(
                List.of(
                    new Welder("Иван", 1),
                    new Devs("Пётр", 100_000, "Java")
                )
        );
        ArrayList<Devs> devs = new ArrayList<>(
                List.of(
                        new Devs("Иван", "Java"),
                        new Devs("Пётр", 100_000, "Java")
                )
        );
//        System.out.println(getAverageSalary(workers));
        System.out.println(getAverageSalary(devs));

//        addDev(devs, new Welder("Петрович", 2));
    }

    /**<? extends Worker> - Wildcard*/
    public static double getAverageSalary(ArrayList<? extends Worker> workers){
        double sum = 0;
//        Devs devs = (Devs) workers.get(0);    //Чтение из списка возможно
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }

//    public static void addDev(ArrayList<? extends Worker> workers, Worker worker){
//        workers.add(worker);       //Запись невозможна, так как можно нарушить типобезопасность
//    }
}
