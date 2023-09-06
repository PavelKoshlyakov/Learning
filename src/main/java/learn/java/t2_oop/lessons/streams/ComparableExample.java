package learn.java.t2_oop.lessons.streams;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        /**
         * Comparable - функциональный интерфейс, описывающий как текущий объект должен сравниваться с другим объектом
         * Принимает как параметр один объект - тот, с которым происходит сравнение
         * */
        TreeSet<People> peoples = new TreeSet<>(
                List.of(
                        new People("Иван Иванов", 20, 10000),
                        new People("Василиса Петрова", 77, 20000),
                        new People("Раиса Владимирова", 43, 30000),
                        new People("Святополк Геройский", 27, 40000),
                        new People("Владимир Краснов", 29, 50000),
                        new People("Лидия Терёхина", 29, 40000),
                        new People("Грека Река", 29, 40000)
                )
        );
        for (People people : peoples) {
            System.out.println(people);
        }
    }
}

class People implements Comparable<People>{
    String name;
    int age;
    int salary;

    public People(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull People people) {
        if (this.age == people.age && this.salary > people.salary) return 1;
        if (this.age == people.age && this.salary < people.salary) return -1;
        if (this.age == people.age) return this.name.compareTo(people.name);
        return this.age - people.age;
    }
}


