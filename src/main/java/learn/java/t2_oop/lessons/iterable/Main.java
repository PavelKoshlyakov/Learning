package learn.java.t2_oop.lessons.iterable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// ================================== ИТАРАТОР КОЛЛЕКЦИИ =========================================
//        ArrayList<Integer> integers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()){
//            int i = iterator.next();
//            System.out.println(i);
//        }
//        System.out.println();
//        for (Integer number: integers){
//            System.out.println(number);
//        }

// =================================== ИНТЕРФЕЙС ИТАРТОРА =========================================
//        ArrayList<String> list = new ArrayList<>(
//                List.of("Иванов", "Данилин", "Петров")
//        );
//        School school = new School(list);
//        while (school.hasNext()){
//            String student = school.next();
//            System.out.println(student);
//        }
// ==================================== ITERABLE класс ============================================
        ArrayList<String> list = new ArrayList<>(
                List.of("Иванов", "Данилин", "Петров")
        );
        School school = new School(list);
        for (String name: school){
            System.out.println(name);
        }

// ============================== ITERABLE класс с массивом =========================================
        Student student = new Student("Семёнкин");
        for (String s: student){
            System.out.println(s);
        }
    }
}
