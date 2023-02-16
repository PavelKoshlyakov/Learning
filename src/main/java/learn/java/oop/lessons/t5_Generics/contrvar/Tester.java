package learn.java.oop.lessons.t5_Generics.contrvar;

import learn.java.oop.lessons.t5_Generics.Devs;

public class Tester extends Devs {
    public Tester(String name, String language) {
        super(name, language);
    }

    public Tester(String name, double salary, String language) {
        super(name, salary, language);
    }

    public void test(){
        System.out.println("Идёт тестирование программы...");
    }
}
