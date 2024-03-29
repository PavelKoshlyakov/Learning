package learn.java.t2_oop.lessons.t6_Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Workplace<Devs> devsWorkplace = new Workplace<>();          //Рабочее место для разработчиков!
        devsWorkplace.add(new Devs("Семён", "Java"));
        devsWorkplace.add(new Devs("Иван", "Python"));
//        devsWorkplace.add(new Welder("Илья", 1));                 //Так не получится, типы не совпадают
//        devsWorkplace.printInfo();

//        Workplace<Worker> workplaceWorker = new Workplace<>();
        Workplace<Welder> weldersWorkplace = new Workplace<>();


//================================================ ИНВАРИАНТНОСТЬ ======================================================
        //В Java обобщённые классы являются инвариантными.
        //Например, ArrayList<Devs> можно присвоить только ArrayList<Devs>, но нельзя присвоить ArrayList<Worker>, даже
        //несмотря на то, что Worker является родителем для Devs. Также, нельзя присвоить ArrayList<Worker> коллекцию
        //ArrayList<Devs>

//        ArrayList<Worker> workers = new ArrayList<>();
//        getAverageSalary(workers);

//        ArrayList<Devs> devs = new ArrayList<>();
//        getAverageSalary(devs);

    }

    //Инвариантность
    public static double getAverageSalary(ArrayList<Worker> workers){
        double sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSalary();
        }
        return sum / workers.size();
    }
}
