package learn.java.threads.t6_notify_wait;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Main {
    public static Integer pagesInPrinter = 15;
    public static void main(String[] args) throws InterruptedException {
        Printing printing = new Printing();
        printing.start();

        while (pagesInPrinter > 0){
            synchronized (printing){
                printing.wait();
                System.out.println("Заправка картриджа...");
                pagesInPrinter = 15;
                System.out.println();
            }

        }

    }
}

class Printing extends Thread {

    @Override
    public void run() {
        while ( true) {
            synchronized (this){
                System.out.println("Страница напечатана");
                Main.pagesInPrinter--;
                if (Main.pagesInPrinter <= 0) notify();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
