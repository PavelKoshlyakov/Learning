package review;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class CountedThread extends Thread {
    public static volatile int counter = 0;
    private int numberThread;

    /**
     * Конструктор
     *
     * @param numberThread Номер потока
     */
    public CountedThread(int numberThread) {
        this.numberThread = numberThread;
    }

    @Override
    public void run() {
        while (counter < 42){
            try {
                int delay = (int) (Math.random() * (3000 - 1000) + 1000);   //Генерация случайного числа в диапазоне от 1000 до 3000
                sleep(delay);                                               //Поток "замирает" на указанное время

                //Чтобы при параллельной работе все разом не увеличили счётчик больше максимального значения
                if (counter < 42){
                    counter++;
                    System.out.println("Поток №" + numberThread + " увеличил counter; интервал = " + delay + "мс; counter = " + counter);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
