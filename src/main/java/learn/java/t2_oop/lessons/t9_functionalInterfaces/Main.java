package learn.java.t2_oop.lessons.t9_functionalInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<String> concatinate = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                return s + " " + s2;
            }
        };

        String fio1 = concatinate.apply("Иван", "Иванов");
        System.out.println(fio1);

    }
}
