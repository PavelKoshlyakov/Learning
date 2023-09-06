# Потоки

<!-- TOC -->

* [Потоки](#потоки)
* [Основные определения](#основные-определения)
* [Способы создания потока](#способы-создания-потока)
    * [Первый вариант создания потока](#первый-вариант-создания-потока)
    * [Второй вариант создания потока](#второй-вариант-создания-потока)
    * [Третий способ](#третий-способ)
* [Жизненный цикл потока](#жизненный-цикл-потока)
* [Работа с потоками](#работа-с-потоками)
    * [Приостановка потока](#приостановка-потока)
    * [Ожидание завершения потока](#ожидание-завершения-потока)
    * [Приоритеты потоков](#приоритеты-потоков)
    * [Принудительный переход к другому потоку](#принудительный-переход-к-другому-потоку)
* [Синхронизация потоков](#синхронизация-потоков)
    * [Оператор synchronized(){}](#оператор-synchronized)
    * [Синхронизированный метод](#синхронизированный-метод)
    * [Сравнение синхронизированного метода и блока синхронизации](#сравнение-синхронизированного-метода-и-блока-синхронизации)
    * [Синхронизация статического метода](#синхронизация-статического-метода)
    * [Проблема _Dead locks_](#проблема-dead-locks)
* [Синхронизированные коллекции](#синхронизированные-коллекции)
    * [Synchronized collections](#synchronized-collections)
    * [Concurrent collections](#concurrent-collections)

<!-- TOC -->

# Основные определения

**_Поток_** - последовательность инструкций, которые выполняются параллельно с другими потоками. За исполнением потоков
следит
операционная система.

**_Главный поток_** - поток статического метода, который является входной точкой в приложение. Как правило, это
метод `public static void main()`

**_Процесс_** - это совокупность потоков, выполняющих различные действия для обеспечения какой то одной задачи.

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

## Приоритеты потоков

Каждому потоку можно установить его приоритет выполнения. Приоритет потока позволяет системе определить, какой именно
ожидающий выполнения поток следует запустить. По умолчанию, приоритет потоков равен 5.

Для установки приоритета потока используется метод `setPriority()`, принимающий в качестве параметра целое число
от 1 до 10. Существуют три константы, которые также можно использовать для установки
приоритета: `Thread.MIN_PRIORITY`, `Thread.NORM_PRIORITY`, `Thread.MAX_PRIORITY`

## Принудительный переход к другому потоку

Метод `Thread.yield()` приостанавливает текущий поток, переводя его в состояние _Runnable_. После этого будет
выполняться другой поток.

```java
public class Main {
    public static void main(String[] args) {
        MyThread threadMinPriority = new MyThread();
        threadMinPriority.setPriority(Thread.MIN_PRIORITY);
        threadMinPriority.start();

        MyThread threadNormalPriority = new MyThread();
        threadNormalPriority.setPriority(Thread.NORM_PRIORITY);
        threadNormalPriority.start();

        MyThread threadMaxPriority = new MyThread();
        threadMaxPriority.setPriority(Thread.MAX_PRIORITY);
        threadMaxPriority.start();

        MyThread threadSomePriority = new MyThread();
        threadSomePriority.setPriority(7);
        threadSomePriority.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Поток с приоритетом: " + getPriority());
        }
        System.out.println("Поток с приоритетом: " + getPriority() + " почти закончил...");
        Thread.yield();
        System.out.println("Поток с приоритетом: " + getPriority() + " завершился");
    }
}
```

В примере выполнение потока приостанавливается перед выводом фразы о завершении работы потока

# Синхронизация потоков

Бывают случаи, когда несколько параллельно-выполняемых потока пытаются обратиться к общему ресурсу. Если ресурс
может быть изменен в результате выполнения одного из потоков, то другие потоки должны дождаться пока изменения в потоке
будут завершены. В противном случае, потоки получат ресурс, данные которого будут ошибочными.

Гарантировать одновременное использование общего ресурса только одним потоком может так называемая синхронизация.
**_Синхронизация_** — это процесс, который упорядочивает доступ из разных потоков к общему ресурсу.

Для примера рассмотрим код, который будет работать некорректно без использования синхронизации. Есть класс `Resources`,
который является хранилищем какого-либо ресурса, например, денег, алмазов, коллекционных предметов и т.п.

```java
class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity += quantity;
    }
}
```

Создадим поток, который будет взаимодействовать с ресурсом и изменять его значение.

```java
class MyThread extends Thread {
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.changeQuantity(10);
        }
    }
}
```

В главном классе создадим два экземпляра класса потока и запустим их.

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        //Если ресурсы разные, то проблем не будет
//        thread1.setResource(new Resource(0));
//        thread2.setResource(new Resource(0));

        Resource resource = new Resource(0);
        thread1.setResource(resource);
        thread2.setResource(resource);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(thread1.getResource().getQuantity());
        System.out.println(thread2.getResource().getQuantity());
    }
}
```

В таком случае, ожидается, что конечное значение объекта `Resources` должно быть равным 20 000. Но это не так. Потоки
конкурируют друг с другом, поэтому конечное значение ресурса будет некорректным. Эту проблему можно решить при помощи
синхронизации.

В языке _Java_ синхронизация применяется к целым методам или фрагментам кода. Исходя из этого существует два способа
синхронизации программного кода:

* за счет использования оператора synchronized () {}.
* за счет использования модификатора доступа synchronized;

## Оператор synchronized(){}

Синхронизация базируется на использовании мониторов. **_Монитор_** — это объект, который используется для
взаимоисключающей блокировки. Взаимоисключающая блокировка позволяет владеть монитором только одному объекту-потоку.
Каждый объект-поток имеет собственный, неявно связанный с ним, монитор.
Поток выполнения (который представлен объектом) может завладеть монитором в случае, если он запросил блокировку и
монитор свободен на данный момент. После того, как объект вошел в монитор, все остальные объекты-потоки, пытающиеся
войти в монитор, приостанавливаются и ожидают до тех пор, пока первый объект не выйдет из монитора.

Монитором может обладать только один поток. Если поток (объект) обладает монитором, то он при необходимости может
повторно войти в него.

Изменим код с ресурсами из прошлого пункта. Изменению подвергнется только класс `Resources`.

```java
class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        synchronized (this) {
            this.quantity += quantity;
        }
    }
}
```

В методе `changeQuantity(int quantity)`  появился блок синхронизации. Параметром `synchronized` может быть только
ссылочный тип данных.

Теперь, когда один поток работает с ресурсом, на этот ресурс устанавливается _Lock_, то есть ни один другой поток не
может с ним взаимодействовать до тех пор, пока текущий поток не освободит этот ресурс.

## Синхронизированный метод

Синхронизированный метод позволяет сделать полностью синхронизированный метод. Всё его тело будет находиться внутри
синхронизации. Удобно использовать в тех случаях, когда нужно установить синхронизацию на весь метод целиком.

Изменим метод `public void changeQuantity(int quantity)` класса `Resources`

```java
class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public synchronized void changeQuantity(int quantity) {
        this.quantity += quantity;
    }
}
```

Сигнатура метода изменилась. После модификатора доступа добавилось ключевое слово `synchronized`.

## Сравнение синхронизированного метода и блока синхронизации

Два способа, в принципе, очень похожи, однако, они имеют различие в реализации.

<table>
<tr>
<td><strong>Синхронизированный метод</strong></td>
<td><strong>Блок синхронизации</strong></td>
</tr>
<tr>
<td>

Как выглядит синхронизированный метод `changeQuantity` изнутри.

```java
class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        synchronized (this) {
            System.out.println("Добавляемое значение = " + quantity);
            this.quantity += quantity;
        }
    }
}
```

</td>
<td>

```java
class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        System.out.println("Добавляемое значение = " + quantity);
        synchronized (this) {
            this.quantity += quantity;
        }
    }
}
```

</td>
</tr>
</table>

## Синхронизация статического метода

Синхронизация статического метода практически ничем не отличается от синхронизации нестатического метода. В сигнатуре
метода появляется ключевое слово `static`. Но в плане внутренней реализации различия всё таки будут. Дело в том, что
при синхронизации статического метода в качестве монитора будет выступать сам класс.

В классе `Calculator` есть синхронизированный метод `sum(int a, int b)`, получающий в качестве параметров два числа.
Метод возвращает сумму
переданных значений и является статическим.

```java
class Calculator {

    public static synchronized int sum(int a, int b) {
        int res = a + b;
        return res;
    }
}
```

Сравним статическую и не статическую синхронизацию метода `sum(int a, int b)` и посмотрим какой именно объект будет
являться монитором:

<table>
<tr>
<td><strong>Не статическая синхронизация</strong></td>
<td><strong>Статическая синхронизация</strong></td>
</tr>
<tr>
<td>

```java
class Calculator {

    public int sum(int a, int b) {
        synchronized (this) {
            int res = a + b;
            return res;
        }
    }
}
```

</td>
<td>

```java
class Calculator {
  public static int sum(int a, int b) {
    synchronized (Calculator.class) {
      int res = a + b;
      return res;
    }
  }
}
```

</td>
</tr>
</table>

## Проблема _Dead locks_

## Методы wait и notify

Методы `wait()` и `notify()` есть у абсолютно любого объекта _Java_, потому что они определены в классе `Object`. Данные
методы позволяют организовать взаимодействие между двумя потоками посредством оповещения. Таким образом, один поток (
вызвавший `notify()`) сообщает другому потоку (который ранее вызвал `wait()`), что второй может продолжать свою работу.

`wait()` - освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не
вызовет метод `notify()`.Переводит поток в состояние _WAITING_.
`notify()` - продолжает работу потока, у которого ранее был вызван метод `wait()`. Снимает состояние _WAITING_ с потока
`notifyAll()` - возобновляет работу всех потоков, у которых ранее был вызван метод `wait()`. Снимает состояние _WAITING_
с потока

Важно, что все вышеперечисленные методы должны вызываться только из синхронизированного контекста, то есть из
синхронизированного блока или метода. При чём, синхронизация должна быть по одному и тому же объекту!

Ниже приведён простой пример, в котором сначала происходит ожидание заполнения списка значениями, а после этот список
выводится в консоль.

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        Storage storage = new Storage(list);
        storage.start();

        synchronized (storage) {
            System.out.println("Ожидание заполнения списка");
            storage.wait();

            System.out.println("Собираюсь выводить список...");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}

class Storage extends Thread {
    private ArrayList<Integer> listProducts;

    public Storage(ArrayList<Integer> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                System.out.println("В список добавлено значение " + i);
                listProducts.add(i);
            }
            System.out.println("Список заполнен! Передаю управление...");
            notify();
        }

    }
}
```

В примере ниже описано взаимодействие двух потоков. Главный поток ожидает команды от потока `Printing`, чтобы продолжить
свою работу. Так происходит многократно.

```java
public class Main {
    public static Integer pagesInPrinter = 15;

    public static void main(String[] args) throws InterruptedException {
        Printing printing = new Printing();
        printing.start();

        while (pagesInPrinter > 0) {
            synchronized (printing) {
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
        while (true) {
            synchronized (this) {
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
```

В приведённом выше примере задержка обязательна! Без этой задержки поток `Printing` будет всегда захватывать монитор.

# Синхронизированные коллекции

Известные нам коллекции, которыми мы пользовались ранее, такие как `ArrayList`, `LinkedList`, `HashMap` и т.п., не
являются потокобезопасными. Они работают быстро, потому что им не нужно следить за тем, чтобы множество потоков работали
с ними корректно.

Для примера, рассмотрите предложенный ниже код. Запустите его несколько раз, и, скорее всего, каждый раз Вы увидите
новый результат

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(list);
    }
}
```

При запуске данного кода, с высокой долей вероятности можно получить ошибку `ArrayIndexOutOfBoundsException`. Это
происходит из-за того, что
в момент добавления элемента одним потоком операция прерывается и в дело вступает другой поток. Получается, что первый
поток сместил указатель, но не
расширил коллекцию и когда пришёл второй поток, он обратился по новому индексу, который оказался за границами коллекции.

Теперь посмотрим, что будет происходить при попытке чтения значений из коллекции в нескольких потоках, параллельно с
добавлением.

```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();

        Runnable r1 = () -> {
            while (list.size() < 20) {
                int number = list.size();
                list.add(number);
                System.out.print("Thread = " + Thread.currentThread().getName());
                System.out.println(list);
            }
        };

        new Thread(r1, "t1").start();
        new Thread(r1, "t2").start();
        new Thread(r1, "t3").start();
    }
}
```

При запуске данного кода, с высокой долей вероятности можно получить ошибку `ConcurrentModificationException`.
Происходит это потому, что класс ArrayList имеет переменные `modCount` и `expectedModCount`, которые он использует для
отслеживания итератора и размера списка. Если они не равны, то и генерируется
исключение `ConcurrentModificationException`. Такого рода проблемы решаются при помощи синхронизированных коллекций

Для многопоточных коллекций есть возможность выбора из двух вариантов:

* Synchronized collections
* Concurrent collections

Synchronized collections - это обёртка обычных коллекций, полученная в результате специального преобразования коллекции
в её синхронизированную версию

Concurrent collections - коллекции, изначально созданные для работы с многопоточностью

## Synchronized collections

_Synchronized collections_ это обёртки над обычными коллекциями, имплементирующих интерфейс `Collection`. Также,
позволяют сделать синхронизированную `Map`.

Существует три основных варианта:

* Collections.synchronizedList(List)
* Collections.synchronizedSet (Set)
* Collections.synchronizedMap (Map)

Рассмотрим на примере синхронизации `List` коллекции.

```java
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
```

Сколько бы раз этот код не запускался, никогда не будет ошибки. Связано это с тем, что
обёртка `Collections.synchronizedList(new ArrayList<>())` над `ArrayList`
создаёт новый объект класса, имплементирующего интерфейс `List`, у которого каждый метод интерфейса будет содержать блок
синхронизации.

Такие коллекции работают медленнее чем их не потокобезопасные прародители. Связано это с тем, что синхронизированные
коллекции должны следить за тем, чтобы с ними
одновременно работал только один поток. На это тратится определённое количество ресурсов, поэтому они медленнее.

## Concurrent collections

_Concurrent collections_ являются отдельно реализованными классами коллекций, созданных специально для работы с
многопоточностью. Такие коллекции имеют
преимущество по времени выполнения, по сравнению с _Synchronized collections_.

![](C:\Users\Pavel\IdeaProjects\Learning\src\main\resources\images\Time_synchronized_vs_concurrency.png)

Среди _Concurrent collections_ можно выделить несколько наиболее популярных:

* ConcurrentHashMap
* CopyOnWriteArrayList
* CopyOnWriteArraySet

Каждая из этих коллекций обладает своими особенностями внутреннего устройства.

`СoncurrentHashMap` использует несколько сегментов, и данный класс нужно рассматривать как группу `HashMap`’ов. Количество
сегментов по умолчанию равно 16. Если пара key-value хранится в 10-ом сегменте, то ConcurrentHashMap заблокирует, при
необходимости, только 10-й сегмент, и не будет блокировать остальные 15

`CopyOnWriteArrayList` создаёт новую копию списка при выполнении модифицирующей операции и гарантирует, что её итераторы
вернут
состояние списка на момент создания итератора и не сгенерируют `ConcurrentModificationException`. Это так называемый
алгоритм _CopyOnWrite_.
Нет необходимости клонировать список до перебора или блокировать его во время перебора, т.к. используемая итератором
копия списка изменяться не будет.
Другими словами, `CopyOnWriteArrayList` содержит изменяемую ссылку на неизменяемый массив, поэтому до тех пор, пока эта
ссылка остаётся фиксированной, будут получены все преимущества потокобезопасности без необходимости блокировок.

`CopyOnWriteArraySet` также как и `CopyOnWriteArrayList` реализуют алгоритм _CopyOnWrite_. Преимущества и общий принцип
организации многопоточности работает также, как и в `CopyOnWriteArrayList`.

