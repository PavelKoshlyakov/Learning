package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a string");
//        String input = sc.nextLine();
//        char[] arrInput = input.toCharArray();
//        int[] number = new int[arrInput.length];
//        int step = 2, j = 0;
//        for (int i = 0; i < arrInput.length; i++) {
//            if (arrInput[i] == '*') {
//                number[j] = i;
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(number));
//
//        for (int i = 0; i < arrInput.length; i++) {
//            if (number[i] != 0 || i == 0) {
//                if (number[i + 1] == number[i] + step) {
//                    step++;
//                    number[i + 1] = number[i + 1] - 1;
//                    for (int k = number[i + 1]; k > number[i]; k--) {
//                        char temp = arrInput[k];
//                        arrInput[k] = arrInput[k + 1];
//                        arrInput[k + 1] = temp;
//                    }
//                    if (number[i + 1] != number[i] + step) {
//                        step = 2;
//                    }
//                }
//            }
//
//        }
//
//        System.out.print(String.valueOf(arrInput));

        //*Р*ебусы -> **Ребусы
        //Авто*б*у*с -> Авто***бус
        //*Длань -> *Длань
        //*П*одар*о*к -> **Подар**ок

//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//
//        int startIndex = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == '*' && (i == 0 || inputString.charAt(i - 2) != '*')){
//                startIndex = i;
//            }
//            if (inputString.charAt(i) == '*' && (i == inputString.length() - 2 || inputString.charAt(i + 2) != '*')){
//                String chunk = inputString.substring(startIndex, i + 1);
//                String result = "";
//                for (int j = 0; j < chunk.length(); j += 2){
//                    result += "*";
//                }
//                for (int j = 1; j < chunk.length(); j+=2) {
//                    result += chunk.charAt(j);
//                }
//                inputString = inputString.substring(0, startIndex) + result + inputString.substring(i + 1);
//            }
//        }
//        System.out.println(inputString);

        //VER.2
//        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        char[] array = inputString.toCharArray();
//
//        int startIndex = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == '*' && (i == 0 || array[i - 2] != '*')) {
//                startIndex = i;
//            }
//            if (array[i] == '*' && (i == array.length - 2 || array[i + 2] != '*')) {
//                for (int j = startIndex + 1; j < i + 1; j++) {
//                    if (array[j] == '*'){
//                        startIndex++;
//                        int index = j;
//                        while (index != startIndex){
//                            char save = array[index];
//                            array[index] = array[index - 1];
//                            array[index - 1] = save;
//                            index--;
//                        }
//
//                    }
//                }
//            }
//        }
//        System.out.println(String.valueOf(array));

//        int[] smallArray = {10, 20, 30, 40, 50};
//        int[] bigArray = {100, 200, 300, 400, 500, 600};
//
//        if (smallArray.length > bigArray.length){
//            int[] save = smallArray;
//            smallArray = bigArray;
//            bigArray = save;
//        }

//======================= I вариант вывода =====================================
//        for (int i = 0; i < smallArray.length; i++) {
//            System.out.print(smallArray[i] + bigArray[i] + " ");
//        }
//        for (int i = smallArray.length; i < bigArray.length; i++) {
//            System.out.print(bigArray[i] + " ");
//        }

//======================= II вариант вывода =====================================
//        for (int i = 0; i < bigArray.length; i++) {
//            if (i < smallArray.length){
//                System.out.print(smallArray[i] + bigArray[i] + " ");
//            } else {
//                System.out.print(bigArray[i] + " ");
//            }
//        }

//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int pow = scanner.nextInt();

//        int res = 1;
        int res = number;
        for (int i = 0; i < pow - 1; i++){
            res = res * number;
        }
        System.out.println(res);
    }

}

