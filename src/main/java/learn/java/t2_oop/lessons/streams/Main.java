package learn.java.t2_oop.lessons.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        //С появлением Java 8 Stream API позволило программистам писать существенно короче то, что раньше занимало много
//        // строк кода, а именно — упростить работу с наборами данных, в частности, упростить операции фильтрации,
//        // сортировки и другие манипуляции с данными
//
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        for (Integer integer : list) {
////            if (integer < 10) System.out.println(integer);
////        }
//
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
//        list.stream().filter(x -> x < 10).forEach(System.out::println); //Вывод всех элементов коллекции при помощи стрима
//
////====================================== ПРОМЕЖУТОЧНЫЕ ОПЕРАТОРЫ ========================================================
////Метод filter (фильтр) — промежуточный оператор.
////        У фильтра объявляется переменная, например x, которая приравнивается к одному элементу коллекции для перебора
////        (как при for each) и после -> мы указываем как фильтруется наша коллекция и так как это промежуточный
////        оператор, отфильтрованная коллекция идёт дальше в метод forEach который в свою очередь является терминальным
////        (конечным) аналогом перебора for each (Выражение System.out::println сокращенно от: x-> System.out.println(x)),
////        которое в свою очередь проходит по всем элементам переданной ему коллекции и выводит её)
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
//        list.stream().filter(x -> x < 10).forEach(System.out::println);
////        list.stream().filter(x -> x < 10).forEach(x -> System.out.print(x + " "));
////        list.stream().filter(x -> x > 10 && x < 50).forEach(x -> System.out.print(x + " "));
//
////Метод map - создаёт функцию, которая будет обрабатывать каждый элемент
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
//        list.stream().map(x -> x + 5).forEach(System.out::println);
//
//        //Добавление числа 5 к каждому чётному элементу коллекции. Выводятся только изменённые значения
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
//        list.stream()
//                .filter(x -> x % 2 == 0)
//                .map(x -> x + 5)
//                .forEach(System.out::println);
//
//        //Добавление числа 5 к каждому чётному элементу коллекции. Выводятся все значения
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
//        list.stream()
//                .map(x -> {
//                    if (x % 2 == 0) x += 5;
//                    return x;
//                })
//                .forEach(System.out::println);
//
////Пропустить первые несколько значений
////        list.stream().skip(4).forEach(System.out::println);
//
////Ограничить список первыми несколькими значениями
////        list.stream().limit(5).forEach(System.out::println);
//
////Удаляет дубликаты из списка
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 10, 10, 17, 10));
////        list.stream().distinct().forEach(System.out::println);
//
////        list = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
////        System.out.println(list);
//
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        list = (ArrayList<Integer>) list.stream()
////                .sorted(Comparator.reverseOrder())
////                .collect(Collectors.toList());
////        System.out.println(list);
//
////============================================ ТЕРМИНАЛЬНЫЕ ОПЕРАТОРЫ ==================================================
////      Терминальные — обрабатывают элементы и завершают работу стрима, так что терминальный оператор в цепочке может быть только один.
//
////foreach - перебирает все элементы стрима
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        list.stream().map(x -> x + 5).forEach(System.out::println);
//
////count - возвращает количество елементов стрима
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        long count = list.stream().count();                       //Общее количество элементов
////        long count = list.stream()
////                .filter(x -> x % 2 != 0)
////                .count(); //Количество нечётных элементов
////        System.out.println(count);
//
////collect
//
//        //Трансформирование массива в коллекцию
////        String[] array = {"Hello", "World"};
////        List<String> list = Arrays.stream(array).collect(Collectors.toList());
////        System.out.println(list);
//
//        //Трансформирование массива в коллекцию, с изменением каждого элемента
////        String[] array = {"Hello", "World"};
////        List<String> list = Arrays.stream(array).map(x -> x + " word").collect(Collectors.toList());
////        System.out.println(list);
//
////findFirst
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        Optional<Integer> a = list.stream().filter(x -> x > 0).findFirst();//Получение первого положительного числа из коллекции
////        System.out.println(a.get());
//
////anyMatch возвращает true, если хотя бы один из элементов удовлетворяет условию
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        boolean b = list.stream().filter(x -> x > 0).anyMatch(x -> x < 100);
////        System.out.println(b);
//
//        //noneMatch возвращает true, если ни один из элементов не удовлетворяет условию
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        boolean b = list.stream().filter(x -> x > 0).noneMatch(x -> x < 100);
////        System.out.println(b);
//
////====================================== ПРОМЕЖУТОЧНЫЕ ОПЕРАТОРЫ ========================================================
////Метод peek - обрабатывает список, при этом не изменяет его элементы.
////        Возвращает те же элементы, которые поступили ему на вход
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        list = (ArrayList<Integer>) list.stream()
////                .peek(x -> {
////                    x += 10;
////                    System.out.println(x);
////                })
////                .collect(Collectors.toList());
////        System.out.println(list);   //Сам list не изменился
//
////        ArrayList<Integer> list = new ArrayList<>(List.of(-10, 20, -50, 100, -1, 17, 36));
////        ArrayList<String> strings = (ArrayList<String>) list.stream()
////                .peek(x -> System.out.print(x + " "))
////                .filter(x -> x > 0).map(x -> x + "")
////                .collect(Collectors.toList());
////        System.out.println();
////        System.out.println(strings);
//
////generate
////        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);
//
////iterate - создаёт бесконечную последовательность, начиная с указанного элемента.
////      Каждый следующий элемент генерируется по принципу, указанному во втором параметре - UnaryOperator
////        Stream.iterate(10, x -> x + 1).limit(10).forEach(System.out::println);
////        ArrayList<Integer> list = (ArrayList<Integer>) Stream.iterate(1, x -> x * 2).limit(10).collect(Collectors.toList());
////        System.out.println(list);
//
//// ======================================= ФУНКЦИОНАЛЬНЫЙ ИНТЕРФЕЙС =====================================================
////Predicate<T> - функциональный интерфейс, возвращающий истину, если выполняется условие
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36));
////        Predicate<Integer> predicate = x -> x > 0;
////        System.out.println(predicate.test(50));
////        System.out.println(predicate.test(-50));
////        list.stream().filter(predicate).forEach(System.out::println);
//
////Consumer<T> - принимает данные, но ничего не возвращает
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36, 10));
////        Consumer<Integer> consumer = x -> System.out.print(x + " ");
////        consumer.accept(500);
////        System.out.println();
////        list.stream().filter(x -> x != 10).forEach(consumer);
//
////Supplier<T> - не принимает аргументов, но возвращает объект типа T
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36, 10));
////        Supplier<Integer> supplier = () -> { return list.get(0); };
////        System.out.println(supplier.get());
//
////Function<T, R> - принимает данные типа T, взаимодействует с ними, и возвращает данные типа R
////        Аналогичной записью данного функционального интерфейса является функция public R something(T t){}
////        apply(T) - метод функционального интерфейса
////
////        Для примера ниже сигнатура стандартной функции имеет вид public Integer strToInt(String string) {}
////        Function<String, Integer> strToInt = (String string) -> {
////            for (char ch : string.toCharArray()){
////                if (ch < '0' || ch > '9'){
////                    return 0;
////                }
////            }
////            return Integer.parseInt(string);
////        };
////        System.out.println(strToInt.apply("526"));
////        System.out.println(strToInt.apply("qqwe"));
////
////        ArrayList<String> stringArrayList = new ArrayList<>(List.of("123", "ффф", "4", "34оаа"));
////        stringArrayList.stream().map(strToInt).forEach(System.out::println);
//
////UnaryOperator принимает объект типа T, обрабатывает его и возвращает объект типа T
////        Аналогичной записью данного функционального интерфейса является функция public T something(T t){}
////        UnaryOperator<Integer> up = x -> x * 2;
////        System.out.println(up.apply(10));
////
////        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -50, 100, 1, 17, 36, 10));
////        list.stream().map(up).forEach(System.out::println);
//
//
////        ArrayList<String> stringArrayList = new ArrayList<>(List.of("123", "ффф", "4", "34оаа"));
////        stringArrayList.stream().sorted((str1, str2) -> Character.compare(str1.charAt(0), str2.charAt(0))
////        Comparator<String> comparator = () -> {
////            return a - b;
////        };
//
//
////        Scanner scanner=  new Scanner(System.in);
////        int number = scanner.nextInt();
////        ArrayList<String> stringArrayList = new ArrayList<>(List.of("123", "ффф", "4", "34оаа"));
////        stringArrayList.stream().filter(x -> x.length() > number).forEach(System.out::println);
    }

//    public static List<Integer> filter(List<Integer> list){
//        ArrayList<Integer> res = new ArrayList<>();
//        for (Integer integer : list) {
//            if (integer < 10){
//                res.add(integer);
//            }
//        }
//        return res;
//    }
}


