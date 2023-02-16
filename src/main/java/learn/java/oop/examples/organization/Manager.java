package learn.java.oop.examples.organization;

public class Manager extends Human {
    private int quantitySales = 0;

    public Manager(String name, String lastName, int age){
        super.setName(name);
        super.setLastName(lastName);
        super.setAge(age);
    }

    public void setQuantitySales(int quantitySales){
        this.quantitySales = quantitySales;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество продаж: " + quantitySales);
    }

    @Override
    public void say() {
        System.out.println("Здравствуйте, меня зовут " + getName() + ". Чем я могу Вам помочь?");
    }
}
