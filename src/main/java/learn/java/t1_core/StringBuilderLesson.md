<!-- TOC -->

* [StringBuilder](#stringbuilder)
    * [Введение](#введение)
    * [Как создать StringBuilder](#как-создать-stringbuilder)
        * [Объявление строки при инициализации StringBuilder](#объявление-строки-при-инициализации-stringbuilder)
        * [Добавление новой строки к уже существующей](#добавление-новой-строки-к-уже-существующей)
    * [Удаление символа из строки](#удаление-символа-из-строки)
    * [Удаление подстроки из строки](#удаление-подстроки-из-строки)
    * [Получение подстроки](#получение-подстроки)
    * [Изменение длины](#изменение-длины)
    * [Замена в строке](#замена-в-строке)
    * [Как перевернуть строку](#как-перевернуть-строку)

<!-- TOC -->

# StringBuilder

## Введение

Объекты `String` являются неизменяемыми, поэтому все операции, которые изменяет строки, приводят к созданию новой
строки в памяти, что сказывается на производительности приложения. Для решения этой проблемы, чтобы работа со строками
проходила с меньшими издержками, в `Java` существует класс `StringBuilder`.

`StringBuilder` - расширяемая строка, которую можно изменять без ущерба для производительности.

## Как создать StringBuilder

### Объявление строки при инициализации StringBuilder

```java
public class StringBuilderLesson {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Какая-то строка была добавлена сюда");
        System.out.println(builder);
    }
}
```

### Добавление новой строки к уже существующей

Метод `append()` позволяет добавить к существующей строке новую подстроку.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Какая-то строка была добавлена сюда");
        builder.append(" Новая строка ");
        builder.append("Ещё строка");
        System.out.println(builder);
    }
}
```

Метод `append()` позволяет добавлять не только подстроки, но и числа и несколько других типов данных

```java
public class StringBuilderLesson {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Пример: ");
        builder.append(10);
        builder.append(" + ");
        builder.append(20);
        builder.append(" = ");
        builder.append(30);
        System.out.println(builder);
    }
}
```

```java
public class StringBuilderLesson {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        StringBuilder builder = new StringBuilder("Пример: ");
        builder.append(a);
        builder.append(" + ");
        builder.append(b);
        builder.append(" = ");
        builder.append(a + b);
        System.out.println(builder);
    }
}
```

## Удаление символа из строки

Удаление символа из строки реализуется при помощи метода `deleteCharAt()`. В качестве параметра в этот метод передаётся
индекс того символа, который необходимо удалить. В примере ниже представлено удаление нулевого символа строки.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        builder.deleteCharAt(0);            //Удалить символ с индексом 0
        System.out.println(builder);
    }
}
```

## Удаление подстроки из строки

У `StringBuilder` существует метод `delete()`, который принимает в качестве параметров два числа - начало и конец
удаляемой части (подстроки).

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");

        //Удаление подстроки, начинающейся от 0 символа и заканчивающаяся 6 символом (не включительно) 
        builder.delete(0, 6);

        System.out.println(builder);
    }
}
```

## Получение подстроки

Получение подстроки у `StringBuilder` работает аналогичным образом с методом `Substring` класса `String`.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        String s1 = builder.substring(6);
        String s2 = builder.substring(0, 6);

        System.out.println(s1);
        System.out.println(s2);
    }
}
```

## Изменение длины

Для изменения длины используется метод `setLength()`, параметром которого является целое число - новое значение длины.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        builder.setLength(5);               //Обрежет строку и оставит в ней первые 5 символов
        System.out.println(builder);
    }
}
```

## Замена в строке

Замена выполняется при помощи метода `replace()`, который принимает три параметра - начало заменяемой
последовательности (`int`),
конец заменяемой последовательности (`int`) и новое значение (`String`).

В отличие от `replace()`, которым Вы пользовались ранее у класса `String`, метод `replace()` у `StringBuilder` позволяет
выполнять
точечную замену.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        builder.replace(5, 6, "___");       //Замена пятого символа на ___
        System.out.println(builder);
    }
}
```

## Как перевернуть строку

Переворот строки выполняется при помощи метода `reverse()`.

```java
public class StringBuilderLesson {
    public static void main(String[] args) {


        StringBuilder builder = new StringBuilder("Какая-то строка для удаления");
        builder.reverse();
        System.out.println(builder);
    }
}
```