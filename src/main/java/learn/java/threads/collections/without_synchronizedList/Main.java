package learn.java.threads.collections.without_synchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        Runnable runnable = () -> {
//            for (int i = 0; i < 100; i++) {
//                list.add(i);
//            }
//        };
//
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println(list);
//    }
//}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(list);
    }
}
