package learn.java.core;

import java.util.ArrayList;
import java.util.List;

public class FunctionLesson {
    public static int var = 0;
    public static void main(String[] args) {
//        printSomething();
//        printPhrase("Hello world");
//        printPhrase("kmslvksmdlvsd");
//        printPhrase("123");
//        printSum(10, 30);   //a = 10, b = 30
//        printSum(-10, 30);   //a = 10, b = 30

//        int first = 10;
//        Integer second = 100;
//        changeVariable(first, second);
//        System.out.println(first + " " + second);

//        ArrayList<String> list = new ArrayList<>(List.of("first", "second", "third"));
//        changeList(list);
//        System.out.println(list);

//        int c = getSum(10, 20);
//        System.out.println(c);

//        int last = getLastDigit(12345);
//        System.out.println(isDivide3(last));
//        getPositiveList(list);  //Так не делать для функций с возвращаемым значением

//        ArrayList<Integer> list = new ArrayList<>(List.of(10, -8, 0, -85, 15, 39, 4, -5, 6));
//        ArrayList<Integer> newList = getPositiveList(list);
//        System.out.println(newList);

        ArrayList<Integer> list = new ArrayList<>(List.of(10, -8, 0, -85, 15, 39, 4, -5, 6));
        ArrayList<Integer> newList = getPositiveListDivideBy3(list);
        System.out.println(newList);

    }

    //printSomething - название функции
    //void - означает, что у функции нет возвращаемого значения
    public static void printSomething(){
        System.out.println("SOMETHING");
    }

    //String phrase - параметр, который должен передаваться в функцию
    public static void printPhrase(String phrase){
        System.out.println(phrase);
    }

    //int a и int b - параметры
    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

    public static void changeVariable(int a, Integer b){
        a++;
        b++;
        System.out.println("in function " + a + " " + b);
    }

    public static void changeList(ArrayList<String> list){
        list.set(0, "new phrase");
    }


    //int - тип возвращаемого значения.
    //Указываем, что результатом работы функции будет целое число.
    //return - ключевое слово, которое указывает что именно будет результатом работы функции (возвращено из функции).
    //          Является окончание работы функции. Как только return был вызван, функция завершает свою работу.
    public static int getSum(int a, int b){
        int res = a + b;
        return res;
    }

    /**Функция получения последней цифры числа
     * @param number Число
     * @return Последнюю цифру числа*/
    public static int getLastDigit(int number){
        return number % 10;
    }

    /**Проверяет, что число делится на 3
     * @param number Число
     * @return true, если число делится и false, если не делится*/
    public static boolean isDivide3(int number){
        return number % 3 == 0;
//        if (number % 3 == 0){
//            return true;
//        } else {
//            return false;
//        }
    }

    /**Функция формирует список положительных чисел, на основе переданного в неё списка
     * @param list Список целых чисел
     * @return Список положительных целых чисел*/
    public static ArrayList<Integer> getPositiveList(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) result.add(list.get(i));
        }
        return result;
    }

    /**Функция формирует список положительных целых чисел, делящихся на 3*/
    public static ArrayList<Integer> getPositiveListDivideBy3(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<Integer> positiveList = getPositiveList(list);
        for (Integer number : positiveList) {
            if (isDivide3(number)) result.add(number);
        }

        return result;
    }

    /**Функция возвращает первое отрицательное число из списка
     * @param list Список целых чисел
     * @return Первое отрицательное число или 0, если таких чисел нет*/
    public static Integer getFirstNegativeNumber(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) return list.get(i);
        }
        return 0;
    }


//    public static int getQuantity(int n){
//        if (n == 0) return 0;
//        else return n + getQuantity(--n);   // 10 + 9
//    }



}
