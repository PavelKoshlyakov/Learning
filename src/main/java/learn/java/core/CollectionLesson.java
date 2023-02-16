package learn.java.core;

import org.jetbrains.annotations.NotNull;

import javax.crypto.spec.PSource;
import java.util.*;

public class CollectionLesson {
    public static void main(String[] args) {
        // НАТИВНАЯ РЕАЛИЗАЦИЯ
//============================================= ARRAYLIST ============================================================
// ----------------------------------------- СОЗДАНИЕ ------------------------------------------------------------------

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Double> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();

//        LinkedList<String> listString = new LinkedList<>();
//        LinkedList<Integer> listString = new LinkedList<>();
//        LinkedList<Double> listString = new LinkedList<>();

//        List<Integer> listDouble = new ArrayList<>();

        //Инициализация списка
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));

// --------------------------------- МЕТОДЫ ARRAYLIST ----------------------------------------------
        //Добавление элементов
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);               //Добавление элемента
//        list.add(20);
//        list.add(35);
//        list.add(-8);
//        list.add(10);
//        System.out.println(list);

        //Вставка элемента
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
//        list.add(2, 666);       //На вторую позицию вставляется число 666
//        System.out.println(list);

        //Замена элемента по индексу
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
//        list.set(3, 6984);                      //Заменить значение третьего элемента на число 6984
//        System.out.println(list);

        //Длина списка
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
//        System.out.println(list.size());

        //Получение значения списка по указанному индексу
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
//        System.out.println(list.get(3));
//        System.out.println(list.get(10));            //ОШИБКА. Нет такого индекса

        //Получение номера элемента в списке.
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 10, 66, 7, 10));
//        System.out.println(list.indexOf(10));           // Ищет только первое совпадение
//        System.out.println(list.indexOf(6684));         // Если искомого элемента нет, то возвращается -1
//        System.out.println(list.lastIndexOf(10));    // Номер последнего совпадения


        //Проверка,содержится ли элемент в списке
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
//        System.out.println(list.contains(10));      //true - если указанный элемент есть в списке
//        System.out.println(list.contains(6895));    //false - если указанного элемента нет в списке

        //Удаление из списка
        // remove(int)
        //remove(<Тип листа>)
//        ArrayList<> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
//        list.remove(2);         //Удаление по индексу
//        System.out.println(list);
//        list.remove((Integer) 10);      //Удаление по значению (первое попавшееся значение)
//        System.out.println(list);
//        ArrayList<String> listString = new ArrayList<>(List.of("hello", "world", "!"));
//        listString.remove(2);
//        listString.remove("world");
//        System.out.println(listString);

        //Проверка коллекции на пустоту
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
//        System.out.println(list.isEmpty());     //true - если коллекция пустая

        //Сравнение листов
//        ArrayList<String> stringList = new ArrayList<>();
//        stringList.add("Hello");
//        stringList.add("World");
//
//        ArrayList<String> secondStringList = new ArrayList<>();
//        secondStringList.add("Hello");
//        secondStringList.add("world");

//        ArrayList<Integer> thirdList = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));

//        if (stringList.equals(secondStringList)){
//            System.out.println("Листы равны");
//        } else {
//            System.out.println("Листы не равны");
//        }

        //Коллекция в массив
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
//        Integer[] array = list.toArray(Integer[]::new);
//        System.out.println(Arrays.toString(array));

        //Копирование списков
//        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
////        ArrayList<Integer> newList = list;
//        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
//        newList.add(5555);                  //Меняем копию
//        System.out.println("Оригинал: " + list);           //Вывод оригинального списка
//        System.out.println("Копия: " + newList);        //Вывод копии


        //Коллекция в строку
//        ArrayList<String> strings = new ArrayList<>(List.of("Hello", "World"));
//        String[] strings = {"Hello", "World"};
//        String s = String.join(" ", strings);
//        System.out.println(s);
//============================================= LINKED LIST ============================================================
        //Создание двусвязного списка
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        LinkedList<Integer> linkedList1 = new LinkedList<>(List.of(10, 20, 30, 40, 50));

        //Добавление элемента в коллекцию
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        linkedList.add(10);                 //Добавление в конец списка
//        System.out.println(linkedList);
//        linkedList.addLast(666);        //Добавление в конец списка
//        System.out.println(linkedList);
//        linkedList.addFirst(-845);      //Добавление в начало списка
//        System.out.println(linkedList);
//        linkedList.add(2, 444);     //Вставить на вторую позицию число 444
//        System.out.println(linkedList);

        //Добавление коллекции в коллекцию
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        LinkedList<Integer> addedCollection = new LinkedList<>(List.of(15, -8, 40));
//        linkedList.addAll(addedCollection);     //Добавление коллекции в коллекцию
//        System.out.println(linkedList);

        //Получение элемента из коллекции
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        Integer num = linkedList.get(2);      //Получение второго элемента
//        System.out.println(num);
//        System.out.println(linkedList.getFirst());      //Получение первого элемента
//        System.out.println(linkedList.getLast());      //Получение последнего элемента

        //Размер коллекции
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        System.out.println(linkedList.size());  //Количество элементов в списке

        //Проверка, содержится ли значение в двусвязном списке
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        boolean isContain = linkedList.contains(30);        //Содержится ли число 30 в коллекции?
//        System.out.println(isContain);                      //true - если содержится
//        System.out.println(linkedList.contains(6897));      //false - если число не содержится

        //Установить значение элементу с указанным индексом
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        linkedList.set(1, -888);            //Установить элементу с индексом 1 значение равное -888
//        System.out.println(linkedList);

        //Очистка списка
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        linkedList.clear();
//        System.out.println(linkedList);

        // Получение номера указанного элемента
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50, 10));
//        System.out.println(linkedList.indexOf(30));
//        System.out.println(linkedList.indexOf(777));            //Вернётся -1, если указанного элемента нет
//        System.out.println(linkedList.lastIndexOf(10));     //Номер последнего вхождения

        //Удаление элемента
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        linkedList.remove(2);   //Удаление по индексу. 2 - это индекс, потому что он принимается за int
//        linkedList.remove((Integer) 2);   //Удаление по значению. Приведение числа 2 к типу Integer
//        linkedList.removeFirst();           //Удаление элемента с индексом ноль
//        linkedList.removeLast();            //Удаление последнего элемента

        //Получение первого элемента
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        Integer num = linkedList.pop();          // Получение первого элемента коллекции, с последующим удалением
//        System.out.println(num);
//        System.out.println(linkedList);

        //Получение первого или последнего элемента с их последующим удалением
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        System.out.println(linkedList.poll());
//        Integer num = linkedList.pollFirst();
//        System.out.println(num);
//        System.out.println(linkedList.pollLast());
//        System.out.println(linkedList);

//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        System.out.println(linkedList.peek());
//        System.out.println(linkedList.peekFirst());
//        System.out.println(linkedList.peekLast());
//        System.out.println(linkedList);

        //Вставка в начало
//        LinkedList<Integer> linkedList = new LinkedList<>(List.of(10, 20, 30, 40, 50));
////        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.push(444);
//        System.out.println(linkedList);






//================================================= SET ================================================================
        //В наборах нет дублирующихся значений. Любой набор содержит уникальные элементы
        // Хранит данные
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerHashSet);

        //Количесество элементов в наборе
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerHashSet.size());

        //Добавление элементов в набор
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        integerHashSet.add(555);
//        integerHashSet.add(4);
//        integerHashSet.add(555);
//        integerHashSet.add(-8);
//        System.out.println(integerHashSet);

        //List в Set
//        ArrayList<Integer> list = new ArrayList(List.of(678, 67, 678, 99, -9, 123, -6, -9, 66));
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        integerHashSet.addAll(list);
//        System.out.println(integerHashSet);

        //Создать Set из ArrayList
//        ArrayList<Integer> list = new ArrayList(List.of(678, 67, 678, 99, -9, 123, -6, -9, 66));
//        HashSet<Integer> set = new HashSet<>(list);
//        System.out.println(set);

        //Удаление
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        integerHashSet.remove(50);          //Удаление по значению
//        integerHashSet.remove(60);          // Если указанного элемента нет, то ничего не происходит
//        System.out.println(integerHashSet);

        //Проверка наличия элемента в наборе
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        if (integerHashSet.contains(50)){
//            System.out.println("Элемент 50 есть в наборе");
//        } else {
//            System.out.println("Элемент отсутствует");
//        }

        //Очистить набор
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        integerHashSet.clear();
//        System.out.println(integerHashSet);

        //Проверка, что набор пустой
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        if (integerHashSet.isEmpty()){
//            System.out.println("Набор пустой");
//        } else {
//            System.out.println("Набор не пустой");
//        }

        //Перебор элементов
//        HashSet<Integer> integerHashSet = new HashSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerHashSet);
//        //Цикл foreach
//        for(Integer num : integerHashSet){      //<Тип коллекции> <Переменная для каждого элемента> : <Набор/Коллекция>
//            System.out.println(num);
//        }


        //TreeSet -  сортирует данные по возростанию.
        //Имеет все те же методы, что и HashSet + несколько своих уникальных
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerTreeSet);
////        integerTreeSet.add(33);
////        System.out.println(integerTreeSet);
//        integerTreeSet.add(-6);
//        System.out.println(integerTreeSet);

        //Получение первого элемента
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerTreeSet);
//        System.out.println(integerTreeSet.first());

        //Получение последнего элемента
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerTreeSet);
//        System.out.println(integerTreeSet.last());

        //Отсортировать в убывающем порядке
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        integerTreeSet = (TreeSet<Integer>) integerTreeSet.descendingSet();
//        System.out.println(integerTreeSet);

        //Получить ближайший меньший элемент к указанному
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 34, 40, -8, 66));
//        System.out.println(integerTreeSet);
//        System.out.println(integerTreeSet.floor(34));   //34 - значение, к которому подбирается элемент набора (меньше, чем 34)

        //Получить ближайшее элемент к указанному
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerTreeSet.ceiling(9)); //9 - значение, к которому подбирается элемент набора (больше, чем 9)

        //Сравнение ceiling и floor
//        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));
//        System.out.println(integerTreeSet.floor(9));
//        System.out.println(integerTreeSet.ceiling(9));

        TreeSet<Integer> integerTreeSet = new TreeSet<>(List.of(10, 50, 33, 40, -8, 66));

//======================================================== HASHMAP =========================================================================
        //Хэш-таблица - ассоциативный массив (Ключ : значение).
        //Обеспечивает очень быструю вставку и поиск, которые выполняются за время, очень близкое к константе.
        //Связь между значением элемента и его позицией в хэш-таблице задаёт хэш-функция.
        //Хэш-функция - функция, которая создаёт хэш-значение (хэш код) на основании объекта

        //Создание hash map
//        HashMap<Integer, Integer> map = new HashMap<>();

        //Добавление значения в хэш-таблицу
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(10, "Первое значение");     //Добавить пару с ключом 10 и значением 'Первое значение'
//        map.put(20, "Второе значение");
//        System.out.println(map);
//        map.put(5, "Третье значение");
//        System.out.println(map);

        //Добавление HashMap в HashMap
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(10, "Первое значение");
//        map.put(20, "Второе значение");
//        System.out.println(map);
//
//        HashMap<Integer, String> mapToAdd = new HashMap<>();
//        mapToAdd.put(10, "Новое десять");
//        map.put(30, "Тридцать");
//
//        map.putAll(mapToAdd);           //Добаление одной HashMap в другую
//        System.out.println(map);

        //Изменение значения по определённому ключу
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(10, "Первое значение");
//        map.put(20, "Второе значение");
//
//        map.put(10, "Новое значение");
//        System.out.println(map);

        //Получение значения
//        HashMap<Integer, String> map = new HashMap<>();
//        map.put(10, "Первое значение");
//        map.put(20, "Второе значение");
//        System.out.println(map.get(10));    //Получение значения, которое храниться под ключом = 10
//        System.out.println(map.get(25));    //null, потому что нет такого ключа

        //Проверка, есть ли указанный ключ
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//        System.out.println(map.containsKey("Иванов"));  //True - если есть, False - если нет.

        //Проверка, есть ли указанное значение
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//
//        System.out.println(map.containsValue(4));
//        System.out.println(map.containsValue(3));

        //Удаление пары
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//
//        map.remove("Петров");   //Удаление пары по ключу 'Петров'
//        System.out.println(map);

        //Перебор хэш-таблицы
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//        for (Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        //Получение списка ключей и списка значений
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        //Пример
//        HashMap<String, ArrayList<String>> school = new HashMap<>();
//        ArrayList<String> students = new ArrayList<>(
//                List.of("Петров Пётр", "Иванов Иван", "Андреева Дарья", "Смирнов Алексей")
//        );
//        school.put("9 В", students);
//        System.out.println(school);

        //Пример 2
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        hashMap.put("Иванов", 5);
//        hashMap.put("Смирнов", 4);
//        hashMap.put("Панфилов", 2);
//        hashMap.put("Дмитриенко", 3);
//        hashMap.put("Алексеев", 5);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите фамилию человека, исправившего оценку");
//        String surname = scanner.nextLine();
//
//        if (hashMap.containsKey(surname)){
//            int digit = hashMap.get(surname);
//            hashMap.put(surname, digit + 1);
//        } else {
//            System.out.println("Такого ученика нет");
//        }
//        System.out.println(hashMap);
    }
}
