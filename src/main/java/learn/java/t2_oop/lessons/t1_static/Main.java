package learn.java.t2_oop.lessons.t1_static;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int index = Utils.getIndexMax(new ArrayList<>(List.of(10, 20, 30, 40, 50, 45, 50, 16)));
        System.out.println(index);
        System.out.println(Utils.countCall);
    }
}
