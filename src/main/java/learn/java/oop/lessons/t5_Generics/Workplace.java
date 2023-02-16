package learn.java.oop.lessons.t5_Generics;

import java.util.ArrayList;

public class Workplace <T> {
    ArrayList<T> personal;
    ArrayList<String> strings;

    public Workplace(ArrayList<T> personal){
        this.personal = personal;
    }
    public Workplace(){
        this.personal = new ArrayList<>();
    }

    public void add(T worker){
        personal.add(worker);
    }

    public T getWorkerByNumber(int number){
        return personal.get(number);
    }

//    public void printInfo(){
//        for (T t : personal) {
//            System.out.println(t.getName());
//        }
//    }
}
