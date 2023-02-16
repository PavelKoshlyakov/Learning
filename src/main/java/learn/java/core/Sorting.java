package learn.java.core;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        int[] array = createRandomInt(1_000_000);
//        int[] array = createRandomInt(1000);


        Instant start = Instant.now();              //Время начало сортировки
//        bubbleSort(array);
//        selectionSort(array);
//        insertionSort(array);
        quickSort(array, 0, array.length - 1);
//        System.out.println(Arrays.toString(array)); //Вывод массива
        Instant finish = Instant.now();             //Время окончания сортировки
        long elapsed = Duration.between(start, finish).toNanos();
        System.out.println("Сортировка: " + elapsed + " нс");
        System.out.println("\t\t\t" + elapsed / 1_000_000 + " мс");

    }

    /**Сортировка пузырьком
     * @param array - массив, который будет сортироваться*/
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) swap(array, i, j);
            }
        }
    }

    /**Сортировка пузырьком
     * @param array - массив, который будет сортироваться*/
    public static void bubbleSortSecond(int[] array){
        boolean isEnd = false;
        while (!isEnd){
            isEnd = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]){
                    swap(array, i, i - 1);
                    isEnd = false;
                }
            }
        }
    }

    /**Сортировка выбором
     * @param array массив для сортировки*/
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = getMinIndex(array, i);
            swap(array, i, index);
        }
    }


    /**Сортировка вставками
     * Сложность O(n^2)
     * Хорошо работает с массивами, где небольшое количество элементов (примерно, 47 и меньше)
     * На отсортированном массиве выполняется очень быстро*/
    public static void insertionSort(int[] array){
        //Цикл по всем элементам не отсортированного массива
        for (int i = 0; i < array.length; i++) {
            int current = array[i];         //Сохранение текущего значения
            int j = i;
            //Пока элемент слева больше текущего (сохраненного)
            while (j > 0 && array[j - 1] > current){
                array[j] = array[j - 1];    //Сдвиг на одну позицию вправо (того самого элемента, который больше текущего)
                j--;
            }
            array[j] = current;             //Вставка сохранённого значения на нужную позицию
        }
    }

    /**Быстрая сортировка.
     * Делит массив на подмассивы и сортирует их.
     * Хорошо работает с кэшем современных процессоров.
     * Подмассивы сортируются независимо друг от друга
     * @param arr массив, который будет сортироваться
     * @param from начальный индекс массива, который будет сортироваться
     * @param to конечный индекс массива, который будет сортироваться*/
    public static void quickSort(int[] arr, int from, int to){
        if (from < to){
            int leftIndex = from;
            int rightIndex = to;
            int separator = arr[from + (to - from) / 2];    //Элемент в середине массива

            while (leftIndex <= rightIndex){
                while (arr[leftIndex] < separator) leftIndex++;
                while (arr[rightIndex] > separator) rightIndex--;

                if (leftIndex <= rightIndex){
                    swap(arr, rightIndex, leftIndex);
                    leftIndex++;
                    rightIndex--;
                }
            }

            quickSort(arr, from, leftIndex - 1);
            quickSort(arr, leftIndex, to);
        }
    }

    /**Функция, меняющая местами два элемента в массиве
     * @param array - массив, в котором происходит замена
     * @param index1 - индекс первого элемента
     * @param index2 - индекс второго элемента*/
    public static void swap(int[] array, int index1, int index2){
        int save = array[index1];
        array[index1] = array[index2];
        array[index2] = save;
    }

    /**Получение индекса минимального элемента*/
    public static int getMinIndex(int[] array, int indexFrom){
        int min = array[indexFrom];
        int indexMin = indexFrom;

        for (int i = indexFrom; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    /**Создаёт массив, состоящий из случайных целых чисел заданной размерности
     * @param quantity размер массива
     * @return массив случайных целых чисел*/
    public static int[] createRandomInt(int quantity){
        int[] resultArray = new int[quantity];      //Создание результирующего массива, величиной quantity
        Random random = new Random();
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = random.nextInt(1000);
        }
        return resultArray;
    }
}
