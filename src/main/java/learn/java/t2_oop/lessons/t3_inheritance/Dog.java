package learn.java.t2_oop.lessons.t3_inheritance;

public class Dog extends HomeAnimal{
    private String breed;

    public Dog(String name, int age, String color, String breed){
        super(name, age, color);                //Обращение к конструктору родителя
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public void bringStick(){
        System.out.println(getName() + " несёт палку хозяину.");
    }

    public void call(){
        super.call();   //вызвали метод call, который у родителя
        System.out.println(", ко мне!");
    }
}
