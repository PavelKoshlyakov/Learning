package review;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        CountedThread[] threads = new CountedThread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new CountedThread(i);              //Создание очередного потока и присвоение ему номера
            threads[i].start();                             //Запуск потока
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();                              //Ожидаем завершения потока
        }

        System.out.println("Работа потоков завершена!");

    }
}
