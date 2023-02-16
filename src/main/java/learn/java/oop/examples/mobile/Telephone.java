package learn.java.oop.examples.mobile;

public abstract class Telephone {
    private String number;
    private int age = 5;

    public Telephone(String number){
        this.number = number;
    }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    /**Состарить на один год*/
    public void aging(){
        age++;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
