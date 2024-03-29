# HashMap

## Определение

**_HashMap_** - это структура, которая хранит данные в формате ключ:значение. Ключи - это уникальная единица, которая не может дублироваться
в рамках одной `HashMap`. В качестве альтернативы названию данной структуры можно встретить название **_ассоциативный массив_** или **_хэш-таблица_**

В хэш мапе порядок добавления элементов не соблюдается, точно также, как это происходит в `HashSet`. Но, в отличие от сета, сохраняется возможность
получение определённого элемента из структуры.

## Создание HashMap

При создании хэш мапы обязательно указывается два типа данных. Первый тип данных - это тип ключа, а второй тип данных - это тип значения.
Ограничения, связанные с возможностью указания типов точно такие же, как и в других коллекциях (только ссылочные типы данных).

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

Можно сразу инициализировать хэш мапу, используя метод `Map.of`.

```java
HashMap<Integer, String> map = new HashMap<>(Map.of(
                1, "Первое значение",
                2, "Второе значение",
                3, "Третье значение"
            )
        );
```

```java
HashMap<String, Boolean> map = new HashMap<>(Map.of(
                "Математика", true,
                "Информатика", true,
                "История", false
            )
        );
```

## Методы

### Метод добавления элемента в мапу (put)

При помощи метода `put` выполняется добавления значения в мапу по указанному ключу.
Метод принимает два параметра: первый параметр - значение ключа, а второй параметр - само значение, которое сохраняется.

```java
HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Первое значение");     //Добавить пару с ключом 10 и значением 'Первое значение'
        map.put(20, "Второе значение");
        System.out.println(map);
        map.put(5, "Третье значение");
        System.out.println(map);
```

Следует отметить, что метод `put` перезаписывает значение, если указанный ключ уже существует. Например:

```java
HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Первое значение");     //Добавить пару с ключом 10 и значением 'Первое значение'
        map.put(20, "Второе значение");
        System.out.println(map);
        map.put(10, "Новое значение десять");   //Перезапишет значение!
        System.out.println(map);
```

### Метод добавления мапы в мапу (putAll)

Метод `putAll` принимает один параметр - мапу, которую нужно соединить с текущей мапой.

```java
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Первое значение");
        map.put(20, "Второе значение");
        System.out.println(map);

        HashMap<Integer, String> mapToAdd = new HashMap<>();
        mapToAdd.put(10, "Новое десять");
        map.put(30, "Тридцать");

        map.putAll(mapToAdd);           //Добаление одной HashMap в другую
        System.out.println(map);
```

### Изменение значения по определённому ключу

Для изменения значения используется метод `put`. В качестве аргумента указывается ключ, значение которого нужно обновить, а 
в качестве значения указывается новое значение.

### Получение значения по ключу (get)

Для получения значения по ключу (а иначе никак) используется метод `get`, который принимает один параметр - значение ключа.
Если указать ключ, которого в мапе нет - ответом будет значение `null`.

```java
HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Первое значение");
        map.put(20, "Второе значение");
        System.out.println(map.get(10));    //Получение значения, которое храниться под ключом = 10
        System.out.println(map.get(25));    //null, потому что нет такого ключа
```

### Проверка существования ключа (containsKey)

Метод `containsKey` принимает один параметр - значение ключа, которое нужно проверить. Возвращает `true`, если такой ключ есть,
иначе возвращает `false`.

```java
 HashMap<String, Integer> map = new HashMap<>();
//        map.put("Иванов", 5);
//        map.put("Петров", 4);
//        map.put("Сидоров", 4);
//        System.out.println(map.containsKey("Иванов"));  //True - если есть, False - если нет.
```

Хорошо используется в паре с условным оператором.

### Проверка наличия определённого Value в мапе (containsValue)

Метод `containsValue` принимает один параметр - искомое значение, которое нужно проверить. Возвращает `true`, если такое значение есть,
иначе возвращает `false`.

```java
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 5);
        map.put("Петров", 4);
        map.put("Сидоров", 4);

        System.out.println(map.containsValue(4));
        System.out.println(map.containsValue(3));
```

### Удаление пары ключ:значение (remove)

Метод `remove` отвечает за удаление пары ключ:значение и принимает один параметр - ключ, пару которого нужно удалить.

```java
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 5);
        map.put("Петров", 4);
        map.put("Сидоров", 4);

        map.remove("Петров");   //Удаление пары по ключу 'Петров'
        map.remove("Случайный");   // Такого ключа нет, но ошибки не будет
        System.out.println(map);
```

### Перебор мапы

Перебор мапы выполняется не совсем стандартным способом. Обычный foreach применить не получится.

```java
HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 5);
        map.put("Петров", 4);
        map.put("Сидоров", 4);
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
```

### Получение списка ключей и списка значений

```java
HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 5);
        map.put("Петров", 4);
        map.put("Сидоров", 4);
        System.out.println(map.keySet());   //Набор ключей
        System.out.println(map.values());   //Список значений
```

### Примеры

#### Исользование списка в качестве ключа

```java
        HashMap<String, ArrayList<String>> school = new HashMap<>();
        ArrayList<String> students = new ArrayList<>(
                List.of("Петров Пётр", "Иванов Иван", "Андреева Дарья", "Смирнов Алексей")
        );
        school.put("9 В", students);
        System.out.println(school);
```

#### Увеличение оценки ученика. Если ученика нет - сообщить об этом

```java
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Иванов", 5);
        hashMap.put("Смирнов", 4);
        hashMap.put("Панфилов", 2);
        hashMap.put("Дмитриенко", 3);
        hashMap.put("Алексеев", 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию человека, исправившего оценку");
        String surname = scanner.nextLine();

        if (hashMap.containsKey(surname)){
            int digit = hashMap.get(surname);
            hashMap.put(surname, digit + 1);
        } else {
            System.out.println("Такого ученика нет");
        }
        System.out.println(hashMap);
```

#### Поиск ключа по значению

```java
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 5);
        map.put("Петров", 4);
        map.put("Сидоров", 4);

        int mark = 4;
        String surname = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == mark){
                surname = entry.getKey();
                break;
            }
        }

        System.out.println(surname + " имеет оценку " + mark);
```
