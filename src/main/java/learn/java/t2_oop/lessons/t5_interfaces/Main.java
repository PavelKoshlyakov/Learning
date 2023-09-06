package learn.java.t2_oop.lessons.t5_interfaces;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 6, "Серый", true);
        Dog dog = new Dog("Бобик", 3, "Коричневый");
        Fish fish = new Fish("Золотая рыбка", 1, "Золотой");
        printSwimmable(dog);
        printSwimmable(fish);
//        printSwimmable(cat);        //ОШИБКА! Кошка не плавает
        printSwimmable(new Ship());

//        info(cat);
//        info(dog);
//        info(fish);                 //ОШИБКА! Рыбка не домашнее животное

//        dog.printInfo();
//        cat.printInfo();
    }

    static void info(HomeAnimalInterface homeAnimal){
        homeAnimal.getVoice();
        homeAnimal.eat();
    }

    static void makeOlder(Animal animal){
        animal.setAge(animal.getAge() + 1);
    }

    /**В качестве параметра может быть передан ЛЮБОЙ объект, имплементирующий интерфейс SwimmableInterface*/
    static void printSwimmable(SwimmableInterface swimmableAnimal){
        swimmableAnimal.swim();
    }
}
