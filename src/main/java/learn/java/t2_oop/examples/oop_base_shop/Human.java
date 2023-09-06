package learn.java.t2_oop.examples.oop_base_shop;

public class Human {
    /**public - доступ к полям объекта класса могут иметь любые другие классы (доступен всем)
     * private - доступ к полям только внутри класса (доступен только владельцу)
     * protected - доступ только внутри пакета, в котором хранится класс и для наследников
     * package private (default) - доступ только внутри покета, в котором хранится класс.*/

    private String surname;
    private String name;
    private int age;
    private double money;

    public Human(String surname, String name, int age, double money) {
        this.surname = surname;
        this.name = name;
        setAge(age);
        setMoney(money);
    }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0 ) return;           //Если возраст некорректный, то ничего не делаем
        this.age = age;                 //Если возраст корректный, то он присваивается значению поля класса
    }

    public double getMoney() { return money; }
    public void setMoney(double money) {
        if (money < 0) return;
        this.money = money;
    }

    /**Метод траты денежных средств*/
    public void spendMoney(double money){
        this.money = this.money - money;
    }
}
