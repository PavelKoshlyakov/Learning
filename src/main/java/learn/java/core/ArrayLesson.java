package learn.java.core;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {
        //Массив - это сгрупированные данные одного типа, хранящиеся упорядочено
        //Индекс элемента - номер элемента в массиве
        //Индексация (нумерация) в массиве всегда начинается с нуля.
        //Элемент - это ячейка массива (одно из значений)
        //
        //При создании массива обязательно должно указываться количество элементов, которые будут в нём храниться.
        //Нельзя создать массив, не указав его размер.
        //Массив нельзя увеличить или уменьшить стандартными способами, он неизменяемый.


//========================================== СОЗДАНИЕ МАССИВА =================================================================
//        int[] numbers = new int[10];    //Создание пустого массива, состоящего из 10 элементов
//        double[] doubles = new double[10];    //Создание пустого массива, состоящего из 10 элементов
//        int[] initialArray = {10, 20, 30, 40, 50, 60, 77, -8, 999, -66, 0, 15}; //Инициализация массива

        //Количество элементов в массиве
//        int[] array = {10, 20, -8, 999, -66, 0, 15};
//        int size = array.length;
//        System.out.println(size);
//        System.out.println(array.length);   //Можно обращаться к длине сразу, без создания переменной
//======================================== ПОЛУЧЕНИЕ ЗНАЧЕНИЯ =================================================================
        //Получить элемент под конкретным номером
//        int[] initialArray = {10, 20, -8, 999, -66, 0, 15};
//        int number = initialArray[0];   //Получение элемента, хранящегося под индексом 0
//        System.out.println(number);
//        System.out.println(initialArray[3]);    //Получение элемента, хранящегося под индексом 3
//        System.out.println(initialArray[8]);        //ОШИБКА! Элемента с индексом 8 нет в массиве initialArray

//========================================== ВЫВОД МАССИВА =================================================================

//        int[] array = {10, 20, -8, 999, -66, 0, 15};
//        System.out.println(array);       //Такой вывод работать не будет!
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//        System.out.println(array[5]);
//        System.out.println(array[6]);

//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//        int index = 0;
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[index]);
//            index++;
//        }
//        for (int num: array){
//            System.out.println(num);
//        }
        //Вывод не заполненного массива
//        int[] array = new int[5];
//        array[0] = 55;
//        array[2] = 666;
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//================================= ИЗМЕНЕНИЕ ЗНАЧЕНИЙ ЭЛЕМЕНТОВ МАССИВА ========================================================
//        int[] array = {10, 20, -8, 999, -66, 0, 15};
//        array[0] = 15;  //Изменение нулевой ячейки
//        array[1] = 15;  //Изменение первой ячейки
//        array[4] = 15;  //Изменение четвёртой ячейки
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }

        // Изменение ячейки массива
//        int[] array = {10, 20, -8, 999, -66, 0, 15};    //Инициализация массива
////        //Вывод массива до изменения
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
////
//        array[array.length - 1] = 666;              //Изменение последнего элемента массива
////        //Снова вывод
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }

//        int[] array = {10, 20, -8, 999, -66, 0, 15};
//        int sum = 0;
//        for (int i = 0; i < array.length / 2; i++){
//            sum += array[i];
//        }
//        System.out.println(sum);

//============================================== ДВУМЕРНЫЕ МАССИВЫ ========================================================
//        int[] arr = {1, 15, 20};
//        int[][] dArr = {{0, 1, 2}, {14, 6, 8}, {6, 7, -8}};

//        Схема создания: <Тип данных>[][] <Название> = new <Тип данных>[<Количество строк>][<Количество столбцов>]
//        int[][] array = new int[5][5];      //Создание двумерного массива. 5 строчек, 5 столбцов

//        int[][] array = {
//                {1, 2, 3, 4, 5},            //Массив, который лежит в нулевой ячейке
//                {10, 20, 30, 40, 50},       //Массив, который лежит в первой ячейке
//                {-5, 15, 6, 0, -9}          //Массив, который лежит во второй ячейке
//        };

//        //Схема обращения к элементу: <Название массива>[<Номер строки>][<Номер столбца>]
//        for (int i = 0; i < array.length; i++) {            //Перебор строк
//            for (int j = 0; j < array[i].length; j++) {     //Перебор столбцов
//                System.out.print(array[i][j] + "\t");                //i - номер строки, j - номер столбца
//            }
//            System.out.println();
//        }

//        int[][] array = {
//                {1, 2, 3, 4, 5},            //Массив, который лежит в нулевой ячейке
//                {10, 20, 30, 40, 50},       //Массив, который лежит в первой ячейке
//                {-5, 15, 6, 0, -9}          //Массив, который лежит во второй ячейке
//        };
//
//        int[] arrayFromZeroRow = array[0];                  //Можно получить массив, который является одной из строк двумерного массива
//        for (int i = 0; i < arrayFromZeroRow.length; i++) {
//            System.out.print(arrayFromZeroRow[i] + " ");
//        }
    }
}