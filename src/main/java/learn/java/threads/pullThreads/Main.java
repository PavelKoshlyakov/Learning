package learn.java.threads.pullThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /**
         * Пулл потоков позволяет создать ограниченное количество потоков, вместо их большего количества.
         * Основная идея заключается в том, что после завершения работы небольшого количества потоков, они не умирают, а берут новые задачи.
         * За счёт этого достигается оптимизация работы, ведь увеличение количества потоков ведёт к потере производительности
         *
         * Executors.newFixedThreadPool(quantity) - создаёт quantity дежурных потоков, которые ждут потоки для выполнения.
         * Если приходит
         * */

        ExecutorService executorService = Executors.newFixedThreadPool(5);  //Создание пула с 5 потоками
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyThread("A"));
            executorService.execute(new MyThread("B"));
            executorService.execute(new MyThread("C"));
            executorService.execute(new MyThread("D"));
            executorService.execute(new MyThread("E"));
        }
        executorService.shutdown();
    }

}
