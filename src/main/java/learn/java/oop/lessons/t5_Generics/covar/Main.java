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
        // Например, если программист - это работник, то Множество<Программист> - это подтип множества <Работник>

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
//        System.out.println(getAverageSalary(devs));

//        printFirst(workers);

//        addDev(devs, new Welder("Петрович", 2));
    }

    //<? extends Worker> - называется Wildcard
    //<? extends Worker> - означает, что в метод может быть передан как список Worker, так и список наследников Worker
    public static double getAverageSalary(ArrayList<? extends Worker> workers) {
        double sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }

    public static void printFirst(ArrayList<? extends Worker> workers) {
        //Чтение из списка возможно. Объект, который достаётся из списка, считается типом Worker.
        //Это не безопасно, потому что объект может оказаться Welder'ом, а мы пытаемся его превратить в Devs
        Devs devs = (Devs) workers.get(0);
        System.out.println(devs);

        //Можно делать так, если очень нужен именно разработчик
//        if (workers.get(0) instanceof Devs){
//            Devs dev = (Devs) workers.get(0);
//        }
    }
//    public static void addDev(ArrayList<? extends Worker> workers, Worker worker){
//        workers.add(worker);       //Запись невозможна, так как можно нарушить типобезопасность
//    }

}
