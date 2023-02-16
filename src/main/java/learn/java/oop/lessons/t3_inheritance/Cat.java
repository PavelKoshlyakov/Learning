package learn.java.oop.lessons.t3_inheritance;

//Класс Cat унаследован (является производным) от класса HomeAnimal
//Перенимает все доступные свойства родителя
public class Cat extends HomeAnimal{
    private String breed;

    public Cat(String name, int age, String color, String breed){
        super(name, age, color);                //Обращение к конструктору родителя
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public void madness(){
        System.out.println("ТЫГЫДЫК-ТЫГЫДЫК");
    }

    //Переопределяем метод call, реализованный у родителя
    public void call(){
        System.out.println(getName() + " " + getName() + " " + getName() + " кс кс кс.");
    }
}
