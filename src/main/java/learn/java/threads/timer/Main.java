package learn.java.threads.timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = createTimer();

        Scanner scanner = new Scanner(System.in);
        int x = -1;
        while (x != 0) x = scanner.nextInt();

        timer.cancel();
        System.out.println("Таймер остановлен");

//        createTimer("Первый", 10, 2000);
//        createTimer("Второй", 100, 2000);
    }

    public static Timer createTimer(){
        Timer timer = new Timer();
        //TimerTask - Сама задача, которая будет выполняться
        //delay - задержка перед тем, как таймер начнёт работать
        //period - Частота срабатывания таймера
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Очередная запись");
            }
        }, 0, 2000);

        return timer;
    }

    public static Timer createTimer(String name, int startCount, int period){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int x = startCount;
            @Override
            public void run() {
                System.out.println("Таймер " + name + ", счёт: " + x);
                x++;
            }
        }, 0, period);

        return timer;
    }
}
