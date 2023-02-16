package learn.java.oop.examples.organization;

public class Worker extends Human{
    private int quantityDetail = 0;

    public Worker(String name, String lastName, int age){
        super.setName(name);
        super.setLastName(lastName);
        super.setAge(age);
    }

    public void setQuantityDetail(int quantityDetail) {
        this.quantityDetail = quantityDetail;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество сделанных деталей: " + quantityDetail);
    }

    @Override
    public void say() {
        System.out.println("Я не могу, я занят");
    }
}
