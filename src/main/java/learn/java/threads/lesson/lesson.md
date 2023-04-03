# Потоки

<!-- TOC -->

* [Потоки](#потоки)
* [Жизненный цикл потока](#жизненный-цикл-потока)
* [Способы создания потока](#способы-создания-потока)
    * [Первый вариант создания потока](#первый-вариант-создания-потока)
    * [Второй вариант создания потока](#второй-вариант-создания-потока)
    * [Третий способ](#третий-способ)
* [Работа с потоками](#работа-с-потоками)
    * [Приостановка потока](#приостановка-потока)
    * [Ожидание завершения потока](#ожидание-завершения-потока)

<!-- TOC -->

# Жизненный цикл потока

![](C:\Users\Pavel\IdeaProjects\Learning\src\main\resources\images\Threads_life_cycle.png)

1. При создании нового потока, он помечается как _New_. Это значит, что пока он не пригоден для запуска, но уже
   существует.
2. После этого поток помечается как _Runnable_, то есть _готовый к выполнению_, и попадает в пул потоков
3. Когда поток начинает/продолжает выполняться, он помечается как _Running_, то есть _запущенный_
4. Из состояния _Running_ поток переходит в состояние _Runnable_. Данную процедуру реализует JVM по своим алгоритмам
5. Поток может быть помечен как _waiting_, _sleeping_ или _blocking_, если он по определённым причинам ожидает какого то
   события, чтобы быть снова помеченным как _Runnable_
6. Когда поток выполнил свою задачу, то есть завершил метод `run()`, он помечается как _Terminated (Dead)_

# Способы создания потока

## Первый вариант создания потока

Первый вариант создания собственного потока - создание класса наследника от класса `Thread`.

При этом, действия потока задаются в переопределённом методе `run()` внутри класса наследника.
Запуск собственного потока выполняется при помощи метода `start()` объекта класса.

```java
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();     //Создание объекта потока
        myThread.start();                       //Запуск потока

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Поток: " + i);
        }
    }
}
```

## Второй вариант создания потока

Для создания собственного класса потока можно имплементировать интерфейс `Runnable`.
В таком случае, запуск потока будет осуществляться при помощи объекта стандартного класса `Thread`, в конструктор
которого
будет передан объект собственного класса-потока, имплементирующего интерфейс `Runnable`

```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread("Поток1"));
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }

    }
}

class MyThread implements Runnable {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public String getName() {
        return name;
    }
}
```

## Третий способ

Третий способ создания потока - анонимная функция, определяемая сразу по месту.

```java
public class Main {
    public static void main(String[] args) {
        //Анонимная функция, создаваемая по месту, для выполнения локальных действий
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Поток: " + i);
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }
    }
}
```

# Работа с потоками

## Приостановка потока

В поток возможно добавления задержки, при помощи метода `Thread.sleep()`. В качестве параметра методу передаётся целое
число, соответствующее времени задержки в миллисекундах.
Данный метод заставляет поток "замереть".

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);             //Задержка в одну секунду
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
```

В данном случае, после каждого вывода числа, поток будет останавливаться на одну секунду.

## Ожидание завершения потока

Метод объекта потока `join()` заставляет ожидать завершение работы данного потока.

```java
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

class MyThread extends Thread {

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
```