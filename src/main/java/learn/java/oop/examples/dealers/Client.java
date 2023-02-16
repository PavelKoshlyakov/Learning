package learn.java.oop.examples.dealers;

public class Client {

    private String lastname;
    private String name;
    private int age;
    private int balance;

    public Client(String lastname, String name, int age, int balance) {
        this.lastname = lastname;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getLastName() {
        return lastname;
    }

    public int getBalance() { return balance; }

    /**Метод выводит информацию о клиенте*/
    public void printInfoClient() {
        System.out.println("Фамилия " + lastname);
        System.out.println("Имя " + name);
        System.out.println("Возраст " + age);
        System.out.println("Баланс " + balance);
    }
}
