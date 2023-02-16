package learn.java.oop.examples.learning;


public class Main {
    public static void main(String[] args) {
//        Human human = new Human();  //Создание объекта класса Human
//        human.name = "Ivan";
//        human.surname = "Ivanov";
//        human.age = 55;

//        Human human1 = new Human();
////        human1.name = "Petr";
//        human1.surname = "Petrov";
//        human1.age = 10;

        Human human = new Human("Ivan", "Ivanov", 55);
        Human human1 = new Human("Petr", "Petrov", 10);


//        printInfo(human);
//        printInfo(human1);
        human.printInfo();
        human1.printInfo();


        if (human.isOlder(human1)){
            System.out.println(human.surname + " старше чем " + human1.surname);
        }
    }

    public static void printInfo(Human human){
        System.out.println(human.name + " " + human.surname + " " + human.age + " лет");
    }
}
