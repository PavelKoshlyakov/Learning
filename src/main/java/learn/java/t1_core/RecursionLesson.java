package learn.java.t1_core;

public class RecursionLesson {
    public static void main(String[] args) {
        //Рекурсия - это процесс, когда функция вызывает сама себя
        //Рекурсия обязательно должна содержать условие для завершения.
        print(10);

    }

    public static void print(int num){

        //Условие завершения рекурсии
        if (num % 7 != 0){
            print(num - 1); //Рекурсивный вызов
        }
        System.out.println(num);

    }
}
