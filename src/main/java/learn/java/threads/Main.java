package learn.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
//    private static int counter = 0;
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        //1 вариант через класс наследник от Thread
//        SomeThread thread1 = new SomeThread("Поток 1");
//        thread1.start();
////
//        SomeThread thread2 = new SomeThread("Поток 2");
//        thread2.start();

        //Второй вариант через интерфейс Runnable
//        Thread thread = new Thread(new SomeThread("Поток 1"));
//        Thread thread1 = new Thread(new SomeThread("Поток 2"));
//
//        thread.start();
//        thread1.start();

        //Третий вариант без создания отдельного класса
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("j = " + i);
        }

// ================================ АТОМАРНОСТЬ ==================================================
//        Thread thread1 = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000; i++) {
//                    counter++;
////                    counter.incrementAndGet();
//                }
//            }
//        };
//        Thread thread2 = new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10_000; i++) {
//                    counter++;
////                    counter.incrementAndGet();
//                }
//            }
//        };

//        thread2.start();
//        thread1.start();
//        thread1.join();
//        thread2.join();
//        System.out.println(counter);



        //counter++ - это две операции: int c = counter + 1; counter = c;
        //Во время выполнения инкремента другой поток может попытаться увеличить значение переменной.
        //Из-за этого вместо увеличения на 2 произойдёт увеличение только на 1
    }
}
