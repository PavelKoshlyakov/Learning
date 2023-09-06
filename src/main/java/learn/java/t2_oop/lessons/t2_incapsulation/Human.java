package learn.java.t2_oop.lessons.t2_incapsulation;

//Если модификатор не указать, то по умолчанию он protected
//public - доступен всем
//private - доступен только внутри класса
//protected - доступен только в пакете, в котором хранится класс и для всех наследников этого класса
//default (package private) -   доступ только внутри одного пакета

public class Human {

    /**Имя человека*/
    private String name;
    /**Фамилия человека*/
    private String surname;
    /**Возраст человека*/
    private int age = 0;
    /**Количество патронов*/
    private int numberPatrons;


    public Human(String name, String surname, int age){
        setName(name);
        setSurname(surname);
        setAge(age);
        this.numberPatrons = 15;
    }

    //Геттер для имени (поле name)
    public String getName(){ return name; }
    public void setName(String name){
        if (isStringOk(name)){                      //Если со строкой всё хорошо и она не пуста
            this.name = firstLetterToUpper(name);   //тогда устанавливается новое имя для объекта (экземпляра)
        } else {                                    //Иначе
           print("неправильный формат устанавливаемого имени");
        }
    }

    public String getSurname() { return surname; }
    public void setSurname(String surname){
        if (isStringOk(surname)){                      //Если со строкой всё хорошо и она не пуста
            this.surname = firstLetterToUpper(surname);   //тогда устанавливается новое имя для объекта (экземпляра)
        } else {                                    //Иначе
            print("Неправильный формат устанавливаемой фамилии");
        }
    }

    public int getAge() { return age; }
    public void setAge(int age){
        if (age >= 0) this.age = age;
        else print("Неверное значение возраста");
    }

    public int getNumberPatrons() { return numberPatrons; }

    public void printInfo(){
        System.out.println("Имя: " + name + ", фамилия: " + surname + ", возраст: " + age);
    }

    /**Приводит первую букву указанной строки к верхнему регистру
     * @param string строка, у которой первую букву необходимо привести к верхнему регистру
     * @return строка, с большой первой буквой*/
    private String firstLetterToUpper(String string){
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    /**Проверка строки
     * @param string строка для проверки
     * @return true - если строка не пустая и в ней есть символы, иначе возвращается false*/
    private boolean isStringOk(String string){
        return !(string.isBlank() || string == null);
    }

    /**Метод выстрела*/
    public void shoot(){
        if (numberPatrons > 0){
            numberPatrons--;
            System.out.println("Bang!!!");
            System.out.println("Осталось " + numberPatrons + " патронов.");
            System.out.println();
        } else {
            System.out.println("Обойма пуста, стрелять нечем");
        }

    }

    /**Метод перезарядки обоймы*/
    public void reload(){
        System.out.println("===== Перезарядка =====");
        numberPatrons = 15;
    }

    /**Метод вывода информационного сообщения*/
    public void print(String message){
        System.out.println("=====================================================");
        System.out.println("\t" + message.toUpperCase());
        System.out.println("=====================================================");
        System.out.println();
    }

}
