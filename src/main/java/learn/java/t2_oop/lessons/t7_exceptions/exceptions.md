# Исключения в Java

## Определение

**_Исключение_** - ошибка или непредвиденная ситуация, которая возникает при компиляции программы или во время её выполнения.
В программе исключения могут возникать по разным причинам: от ошибки программиста, до непредвиденных действий пользователей.
Из-за возникновения исключений (**_Exception_**) программа останавливает своё выполнение. Это может дорого стоить, поэтому
необходимо либо обрабатывать исключения, либо не допускать их.

## Практические навыки по работе с исключениями

### Как обрабатываются исключения

Обработка исключений происходит при помощи специальной конструкции. В этой конструкции используются ключевые слова `try`, `catch`, `finally` и `throws`.

`try` - определяет блок кода, в котором может произойти исключение

`catch` - определяет блок кода, в котором будет обрабатываться исключение (если оно возникло)

`finally` - определяет блок кода, который будет выполнен не зависимости от того было сгенерировано исключение или нет. Является необязательным блоком.

`throw` - используется для генерации исключения.

`throws` - используется в сигнатуре методов для того, чтобы передать обязанности по обработке исключения в тот метод, который вызвал данный метод.

### try{} catch{}

Код без использования обработки исключений:

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        System.out.println(a + 50);

        System.out.println("Окончание программы");
    }
}
```
Если ввести целое число, то программа отработает корректно. Но при вводе некорректного значения, например, десятичного числа или строки
будет сгенерировано исключение и в этот момент программа прекратит свою работу.

Чтобы этого избежать может быть использована конструкция `try{} catch{}`:
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int a = scanner.nextInt();
            System.out.println(a + 50);
        } catch (Exception e){
            System.out.println("Ошибка ввода. Неверный формат!");
        }

        System.out.println("Окончание программы");

    }
}
```

В приведенном выше фрагменте кода при вводе некорректного значения будет напечатано сообщение в консоли, а после этого
программа спокойно продолжит своё выполнение.

Ещё один пример использования обработки исключений:

```java
public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        int a = 0;
        while (flag){
            try{
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();
                flag = false;
            } catch (Exception e){
                System.out.println("Ошибка ввода. Неверный формат! Попробуйте ещё раз:");
            }
        }
        System.out.println("Наконец то корректное значение переменной a = " + a);
    }
}
```

### try{} catch{} finally{}

Рассмотрим пример кода, который накапливает введённое значение до тех пор, пока вводимое значение является корректным. Как только
будет введено некорректное значение ввод завершается.

```java
public class Main {
    public static void main(String[] args) {

        int counter = 0;
        boolean isRun = true;
        while (isRun){
            try{
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                counter += a;
            } catch (Exception e){
                isRun = false;
            } finally {
                System.out.println("Текущее состояние счётчика = " + counter);
            }
        }
    }
}
```

Благодаря блоку `finally{}` обеспечивается гарантированный вывод сообщения о состоянии значения счётчика `counter`, вне 
зависимости от того, было сгенерировано исключение или нет.

### throw

`throw` позволяет сгенерировать исключение. Это применяется повсеместно для тех случаев, когда набор данных не совпадает
с ожидаемым корректным значением.

Ключевое слово `throw` работает либо в связке с блоком `try{} catch{}`, либо с ключевым словом `throws`.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        try {
            if (a < 0) throw new Exception("Введено отрицательное число");
            System.out.println("Было введено положительное число");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
```

В примере ниже существует класс `Human` с именем, фамилией и возрастом. Для каждого поля есть геттеры и сеттеры.
В сеттере возраста происходит генерация исключения в том случае, если был передан отрицательный возраст.
При помощи блока `try{} catch{}` внутри сеттера происходит обработка исключения и вывод лога исключения, если
оно было поймано.

Таким образом, можно будет легко определить место ошибки.

```java
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", "Иванов", -40);
        human.setAge(-50);
        System.out.println(human);
    }
}
```

```java
class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getAge() { return age; }
    public void setAge(int age) {
        try {
            if (age < 0) throw new Exception("Значение возраста не может быть отрицательным!");
            this.age = age;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
```

### throws

Оператор `throws` применяется в тех случаях, когда метод не должен самостоятельно обрабатывать возникшее исключение. Оператор
`throws` всегда указывается в сигнатуре метода, тем самым, указывая на то, что место вызова этого метода должно обрабатывать
исключение определённого вида.

Для наглядности рассмотрим прошлый пример с классом `Human`, но в котором обработка не корректного параметра возраста
метода `setAge` будет выполняться не внутри метода.

```java
class Human {
    private String name;
    private String surname;
    private int age;

    public Human(String name, String surname, int age) throws Exception {
        this.name = name;
        this.surname = surname;
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if (age < 0) throw new Exception("Значение возраста не может быть отрицательным!");
        this.age = age;

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
```

В методе `setAge` был убран блок `try{} catch{}` и в сигнатуру метода было добавлено **_throws Exception_**. Благодаря
этому, обработка возникшего исключения будет делегировано тому методу, который будет вызывать метод `setAge`. Это можно
наблюдать в конструкторе, в котором вызывается метод `setAge`. Теперь конструктор должен озадачиться вопросом обработки
исключения `Exeption`. Есть два варианта:
1. Добавить в конструктор `try{}catch{}` и обрабатывать в нём метод `setAge`
2. Делегировать обработку этого исключения методу, вызывающему конструктор.

В примере был использован второй вариант, путём добавления в сигнатуру конструктора ключевого слова **_throws Exception_**.

Теперь рассмотрим изменения, которые произошли в главном методе.

```java
public class Main {
    public static void main(String[] args) {
        try{
            Human human = new Human("Иван", "Иванов", 40);
            human.setAge(-50);
            System.out.println(human);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Конец программы!");
    }
}
```

Теперь метод `main`, который вызывает конструктор и сеттер класса `Human` должен быть озадачен вопросом обработки исключения.
Без этого компилятор попросту не скомпилирует код.

На самом деле, можно попробовать делегировать обработку исключения _**JVM**_. Для этого, в сигнатуре метода `main` укажем
**_throws Exception_**. В таком случае, `try{}catch{}` можно убрать из метода `main`, но, таким образом, будет потеряна
возможность индивидуальной обработки исключения и программа будет завершаться при возникновении _Exception_'а.

## Виды исключений

### Структура исключений в Java

![](C:\Users\Pavel\IdeaProjects\Learning\src\main\resources\images\Exception_structure.png)

Все исключения в **_Java_** наследуются от класса `Throwable`. После, происходит разделение на два вида исключений:
1. Checked - те исключения, которые могут быть проконтролированы на этапе компиляции, то есть, характер ошибки может быть известен заранее. Например, заранее может быть известно, по указанному пути к файлу этого файла на самом деле нет.
2. Uncheked - неконтролируемые исключения. Например, невозможно заранее предугадать, что пользователь при выполнении команды `scanner.nextInt()` введёт символы.

От класса `Throwable` наследуются два класса: `Error` и `Exception`. Между ними разница такая же, как между катастрофой и маленькой неприятностью. `Error` и его аналоги не могут
быть обработаны (что можно сделать, когда закончилась память?). `Exception` могут быть обработаны при помощи `try{}catch{}`.

### Создание собственных исключений

