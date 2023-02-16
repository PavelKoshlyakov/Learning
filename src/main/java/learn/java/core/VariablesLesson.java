package learn.java.core;

import java.util.Scanner;

public class VariablesLesson {
    public static void main(String[] args) {

//============================= СОЗДАНИЕ ПЕРЕМЕННЫХ ===============================
        //<ТИП> <НАЗВАНИЕ> = <ЗНАЧЕНИЕ>;
        //Название может быть любым. Начинается с буквы. Нельзя использовать зарезервированные слова
        //Переменные должны называться с маленькой буквы
        //Целые числа
//        byte b = 127;        //-128..127 (1 байт)
//        short sh = 545;     //-2^16..2^16-1 (2 байта)
//        int number = 10;    //-2^32..2^32-1 (4 байта)
//        long l = 556985;    //-2^64..2^64-1(8 байт)
//
//        //Числа с плавающей точкой
//        float fl = 10.56f;  // 4 байта
//        double d = 105.6;   //8 байт
//
//        // Логический тип
//        //Может быть два значения: true или false
//        boolean flag = true;
//        boolean bool = false;
//
//        //Строка
//        String str = "Something kjskjsdnvbkdfnbk !@*&^&*^♫♀♂ 12313";
//
//        //Camel case - слова пишутся слитно, каждое новое слово с большой буквы (кроме первого)
//        int intNumber = 100;

//        Нельзя создать несколько переменных с одним названием
//        int a = 10;
//        int a = 50;
//============================= ВЫВОД ЗНАЧЕНИЙ ===============================

//        System.out.println("Hello world");
//        System.out.println("10 20");
//        System.out.println(10 + " " + 20);

//        int a = 10;
//        int b = 20;
//        System.out.println(a + " " + b);
//        int num = 1056;
//        num = 555;
//        System.out.println(num);    //После себя переводит на новую строку
//
//        System.out.print("aaa");
//        System.out.println("bbb");
//        System.out.println("ccc");
////
//        System.out.print("aaa");    //После себя не переводит на новую строку
//        System.out.print("bbb");

        //-----------------
//        System.out.print("111");
//        System.out.println("222");

//        System.out.println("222");
//        System.out.print("111");

//============================= ВВОД ЗНАЧЕНИЙ ===============================
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int a = scanner.nextInt();  //Позволяет ввести целое число пользователю
//        int c = scanner.nextInt();  //Позволяет ввести целое число пользователю
//        System.out.println(a);
//        System.out.println(c);

//        System.out.println("Введите число: ");
//        double d = scanner.nextDouble();            //Ввод через запятую, например 1,5
//        System.out.println(d);

//============================== ПРИВЕДЕНИЕ ТИПОВ =====================================
//        int firstNumber = 10;
//        System.out.println(firstNumber);
//
//        double secondNumber = firstNumber;  //Неявное (автоматическое) приведение типов
//        System.out.println(secondNumber);
//
//        double dd = 10.856;
//        System.out.println(dd);
//        int ii = (int) dd;  // Явное приведение типов
//        System.out.println(ii);

// ============================= АРИФМЕТИЧЕСКИЕ ОПЕРАЦИИ ===============================

        // Сложение
//        int first = 10;
//        int second = 500;

//         1
//        int result = first + 20;
//        System.out.println(result);

        //2
//        int result = first + second;
//        System.out.println(result);

//        System.out.println(first + second);
        //3
//        System.out.println(first + " " + second);

        //4
//        System.out.println(first + " + " + second + " = " + (first + second));

        //Вычитание
//        int first = 10;
//        int second = 500;
//
//        int res = first - second;
//        System.out.println(res);
//        System.out.println(first - second);
//        System.out.println(first + " - " + second + " = " + (first - second));

        //Умножение
//        int first = 128;
//        int second = 5;
//
//        int res = first * second;
//        System.out.println(res);
//        System.out.println(first * second);
//        System.out.println(first + " * " + second + " = " + (first * second));

        //Деление
//        int first = 10;
//        int second = 15;
//        double div = second / first;    //Если int делится на int, то в результате останется только целая часть
//        System.out.println(div);

//        int first = 10;
//        double second = 15;
//        double div = second / first;    //Если int делится на double, то в результате будет десятичное число
//        System.out.println(div);

//        int first = 10;
//        int second = 15;
//        double div = second / (double) first;
//        System.out.println(div);

//        System.out.println(second / first);

        //Остаток от деления
//        int num = 11;
//        int r = num % 3;
//        System.out.println(r);

        //Возведение в степень
//        int var = 2;
//        double res = Math.pow(var, 5);  //значение переменной var возводится в пятую степень
//        System.out.println(res);

        //Получение квадратного корня
//        int num = 25;
//        double res = Math.sqrt(num);
//        System.out.println(res);


// ============================= ИНКРЕМЕНТ И ДЕКРЕМЕНТ ===============================

//        int a = 10;
//        System.out.println(a);
//        a++;                        //Инкремент (увеличение на единицу)
//        System.out.println(a);
//        a--;
//        System.out.println(a);      //Декремент (уменьшение на единицу)

//        int b = 10;
//        System.out.println(b++);//Постфиксный инкремент
//        System.out.println(b);

//        System.out.println(++b);//Префиксный
//        System.out.println(b);

// ============================= ИЗМЕНЕНИЕ ПЕРЕМЕННЫХ ===============================
//        int a = 15;
//        System.out.println(a);
//        a = 40;                 //Перезапись переменной (изменение значения переменной)
//        System.out.println(a);

//        int a = 15;
//        a = a + 50;             //Прибавление к самому себе (увеличение значения переменной на 50)
////        a += 50;                //Делает тоже самое, что и a = a + 50
//        System.out.println(a);

// ============================= ПРИМЕР ===============================
        //Пользователь вводит два числа. Вывести сумму этих чисел

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int fir = in.nextInt();
//        System.out.println("Введите второе число: ");
//        int sec = in.nextInt();
//        System.out.println(fir + sec);
    }
}
