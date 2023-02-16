package learn.java.oop.lessons.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CompareInterface {
    public static void main(String[] args) {
        /**
         * Компаратор - функциональный интерфейс, предназначенный для сравнения двух объектов.
         * Компаратор возвращает целое число:
         *      1. Меньше нуля, если объект меньше объекта, с которым происходит сравнение
         *      2. Ноль, если объекты равны
         *      3. Больше нуля, если объект больше объекта, с которым происходит сравнение
         * */

        ArrayList<Human> humans = new ArrayList<>(
                List.of(
                        new Human("Иван", 30),
                        new Human("Пётр", 40),
                        new Human("Мария", 15),
                        new Human("Наталья", 40),
                        new Human("Илья", 16)
                )
        );

        /**Компаратор, сравнивающий по возрасту*/
        Comparator<Human> ageComparator = new Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                return human1.age - human2.age;
            }
        };

//        Human human1 = new Human("Иван", 30);
//        Human human2 = new Human("Пётр", 40);
//        int result = ageComparator.compare(human1, human2);
//        System.out.println(result);

//        System.out.println("До сортировки: " + humans);
//        humans.sort(ageComparator);
//        System.out.println("После сортировки: " + humans);

        /**Компаратор, сравнивающий по имени*/
        Comparator<Human> nameComparator = new Comparator<Human>() {
            @Override
            public int compare(Human human1, Human human2) {
                return human1.name.compareTo(human2.name);
            }
        };
        /**Тоже самое, но через лямбду*/
        Comparator<Human> nameLambdaComparator = (Human human1, Human human2) -> {
            return human1.name.compareTo(human2.name);
        };
//        System.out.println("До сортировки: " + humans);
//        humans.sort(nameLambdaComparator);    //Сортировка по имени в алфавитном порядке
//        System.out.println("После сортировки: " + humans);


//        TreeSet<Human> humansSet = new TreeSet<>(nameLambdaComparator); //При создании множества указывается компаратор
//        humansSet.add(new Human("Иван Иванов", 20));
//        humansSet.add(new Human("Василиса Петрова", 77));
//        humansSet.add(new Human("Раиса Владимирова", 43));
//        humansSet.add(new Human("Святополк Геройский", 27));
//        humansSet.add(new Human("Владимир Краснов", 29));
//        System.out.println(humansSet);


        /**Сортировка по возрастанию второй цифры в числе*/
        Comparator<Integer> numbersComparator = (Integer number1, Integer number2) -> {
            return getSecondDigit(number1) - getSecondDigit(number2);
        };

//        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(25, 99, -80, 102, 26, 804, 44));
//        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(150, 785, 99, 800, -61, -856, 21));
//        integerArrayList.sort(numbersComparator);
//        System.out.println(integerArrayList);
    }
    public static int getSecondDigit(int number){
        number = Math.abs(number);
        String s = String.valueOf(number);
        return Integer.parseInt(String.valueOf(s.charAt(1)));
    }
}


class Human {
    int id;
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



