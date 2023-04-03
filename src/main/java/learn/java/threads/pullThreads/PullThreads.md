# Пул потоков

Пулл потоков позволяет создать ограниченное количество потоков, вместо их большего количества. Основная идея заключается
в том, что после завершения работы небольшого количества потоков, они не умирают, а берут новые задачи.

За счёт этого достигается оптимизация работы, ведь увеличение количества потоков ведёт к потере производительности

Класс `Executors` позволяет создавать пулы потоков.

### Дежурные потоки

`Executors.newFixedThreadPool(quantity)` создаёт фиксированное количество дежурных потоков в пуле. Параметр *quantity* -
целое число,
устанавливающие количество дежурных потоков. Созданные потоки ждут задачи для выполнения. Если для выполнения приходит
задача, а все дежурные потоки заняты, то задача ожидает освободившейся поток

Чтобы отправить задачу в пул потоков используется метод `execute(Thread)`. Задача, передаваемая в метод, должна
имплементировать интерфейс `Runnable`

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
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
```

```java
import org.jetbrains.annotations.NotNull;

public class MyThread extends Thread {

    public MyThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". " + getName());
        }
    }
}
```

### Кэшированные потоки

`Executors.newCachedThreadPool` создаёт пул, задача которого - отсутствие очередей задач. Если есть свободные потоки, то
задача делегируется им. Если свободных потоков нет, создаётся новый поток

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
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
```