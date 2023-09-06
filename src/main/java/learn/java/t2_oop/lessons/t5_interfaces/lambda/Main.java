package learn.java.t2_oop.lessons.t5_interfaces.lambda;

public class Main {
    public static void main(String[] args) {
//        Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе.
//        При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

        Printable printable = () -> System.out.println("Какой то вывод");
        printable.print();

//        Operationable<Integer> calc = (x, y) -> x + y;
//        int a = calc.calculate(10, 20);
//        System.out.println(a);
    }
}

interface Operationable<T>{
    T calculate(T x, T y);
}

interface Printable{
    void print();
}