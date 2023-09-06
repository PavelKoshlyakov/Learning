package learn.java.t2_oop.lessons.t1_base.dancer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Dancer dancer = new Dancer("Володина", "Мария", false, 22, 162);       //Создание объекта (экземпляра) класса Dancer
//        dancer.printInfo();
//
//        Dancer dancer1 = new Dancer("Молодцов", "Иван", true,25, 183, 'C');
//        dancer1.printInfo();

        ArrayList<Dancer> dancers = new ArrayList<>(List.of(
                new Dancer("Володина", "Мария", false, 22, 162),
                new Dancer("Молодцов", "Иван", true,25, 183, 'C')
        ));
        dancers.add(new Dancer("Илья", "Морозов", true,22, 191, 'A'));

        for (Dancer dancer : dancers) {
            dancer.printInfo();
        }
    }
}
