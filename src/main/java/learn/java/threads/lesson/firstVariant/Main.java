package learn.java.threads.lesson.firstVariant;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("Поток 1");     //Создание объекта потока
        MyThread myThread1 = new MyThread("Поток 2");

        myThread.start();                       //Запуск потока
        myThread1.start();                       //Запуск потока

        myThread.join();                        //Ожидание завершения потока
        myThread1.join();                       //Ожидание завершения потока

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }

    }
}

class MyThread extends Thread{

    public MyThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }
}
