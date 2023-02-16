package learn.java.core;

import java.util.Scanner;

public class ifLesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//==================================================== ОПЕРАЦИИ СРАВНЕНИЯ =============================================================
//        System.out.println("Введите число:");
//        int input = in.nextInt();
//
//        System.out.println(input < 0);      //Меньше
//        System.out.println(input <= 0);      //Меньше или равно
//        System.out.println(input > 50);     //Больше
//        System.out.println(input >= 50);     //Больше или равно
//        System.out.println(input == 60);    //Равно
//        System.out.println(input != 10);    //Не равно

//==================================================== ЛОГИЧЕСКИЕ ОПЕРАНДЫ =============================================================
        //Логическое ИЛИ (Конъюнкция)
        //Логическое ИЛИ верно в том случае, если с одной из сторон есть true
//        System.out.println(false || false); //false
//        System.out.println(false || true);  //true
//        System.out.println(true || false);  //true
//        System.out.println(true || true);   //true
//        System.out.println(true || false || false);

        //Логическое И (Дизъюнкция)
//        System.out.println(false && false); //false
//        System.out.println(false && true);  //false
//        System.out.println(true && false);  //false
//        System.out.println(true && true);   //true
//        System.out.println(true && true && false);

        // ! - инверсия (отрицание). Переворачивает значение
//        System.out.println(!true);      //false
//        System.out.println(!false);     //true

//============================================== СОСТАВНЫЕ ЛОГИЧЕСКИЕ КОНСТРУКЦИИ =============================================================
//        int a = 10;
//        int b = 15;
//        System.out.println(a !=b && a < 50 || !false || b < 10 + a);

        //Исходное выражение: a !=b && a < 50 || !false || b < 10 + a
        //2) a !=b && a < 50 || true || b < 10 + a
        //3) a !=b && a < 50 || true || b < 20
        //4) a !=b && true || true || true
        //true && true || true || true
        //true || true || true
        //true

//        int a = 10;
//        int b = 15;
//        boolean bool = a !=b && a < 50 || !false || b < 10 + a;
//        System.out.println(bool);

//================================================= УСЛОВНЫЙ ОПЕРАТОР IF ======================================================================
        //if(){}
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a != 100) {
//            System.out.println(a + " не равно 100");
//        }
//        System.out.println("После условия");

        //if(){}else{}
//        int a = 10;
//        int b = a + 50;
//
//        if (a < b){
//            System.out.println("Первое число меньше второго");
//        } else {
//            System.out.println("Первое число не меньше второго");
//        }


//        if(){}else if(){}
//        int num = 50;
//        if (num < 200){
//            System.out.println("Число от 100 до 200");
//        } else if (num < 100){
//            System.out.println("Число");
//        }
//        int a = 10;
//        if (a != 10) {
//            System.out.println("Число не равно 10");
//        } else if (a >= 0) {
//            System.out.println("Число больше нуля");
//        } else if (a != 0) {
//            System.out.println("Число не равно нулю");
//        } else{     //В любом другом случае (else может отсутствовать)
//            System.out.println("Ни один из верхних вариантов не подошёл");
//        }

        //Целесообразоность
//        int a = in.nextInt();
        //Так сложнее
//        if (a > 50){
//            System.out.println("a больше 50");
//        }
//        if (a <=50){
//            System.out.println("a меньше или равно 50");
//        }
        //Тоже самое, но проще
//        if (a > 50){
//            System.out.println("a больше 50");
//        } else {
//            System.out.println("a меньше или равно 50");
//        }

        //Пример: Пользователь вводит число. Определите, что число находится в диапазоне от 10 до 100 включительно
//        int number = in.nextInt();
//        if (number >= 10 && number <= 100){
//            System.out.println("Число в диапазоне");
//        }

//================================================= ОПЕРАТОР ВЫБОРА SWITCH/CASE ===================================================================
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("Была введена единица");
//                break;
//            case 5:
//                System.out.println("Была введена пятёрка");
//                break;
//            case 10:
//                System.out.println("Была введена десятка");
//                break;
//            default:
//                System.out.println("Какое-то другое число");
//        }

//================================================= ТЕРНАРНЫЙ ОПЕРАТОР ===================================================================

        //Обычный вариант
//        int a = 0;
//        if (10 > 15) {
//            a = 10;
//        } else {
//            a = 20;
//        }

        //тернарный оператор
//        int a = (10 > 15) ? 10 : 20;
//        System.out.println(a);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = (a == 10) ? 100 : -100; // <условие> ? <значение, если условие верно> : <значение, если условие ложно>
//        System.out.println(b);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        int c = (a + b);
//        if (c % 2 == 0){
//            System.out.println("Сумма двух чисел чётная");
//        }

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int x = 0;
//
//        if (a > b && a % b == 0) x = a / b;
//        else x = a % b;
//
//        System.out.println(x);




    }
}
