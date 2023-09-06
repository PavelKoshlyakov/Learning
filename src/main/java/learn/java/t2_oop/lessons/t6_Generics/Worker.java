package learn.java.t2_oop.lessons.t6_Generics;

public abstract class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
