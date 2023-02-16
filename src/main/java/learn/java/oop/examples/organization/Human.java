package learn.java.oop.examples.organization;

public abstract class Human implements HumanAction{
    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age);
    }
}
