package learn.java.t2_oop.examples.generics_zoo;

import learn.java.t2_oop.examples.generics_zoo.animals.Animal;

import java.util.ArrayList;

public class Cage <T extends Animal>{
    /**Максимальное количество животных*/
    final int maxAnimals;
    /**Список животных*/
    private ArrayList<T> animalsInCage = new ArrayList<>();

    public Cage(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public void addAnimal(T animal){
        if (isFreePlaces()) animalsInCage.add(animal);
    }

    public boolean isFreePlaces(){
        return maxAnimals > animalsInCage.size();
    }

    /**Получение животного по имени*/
    public T getAnimalByName(String name){
        for (T t : animalsInCage) {
            if (t.getName().equals(name)) return t;
        }
        return null;
    }
    /**Вывести животное из загона*/
    public T takeOutAnimal(String nameAnimal){
        T animal = getAnimalByName(nameAnimal);
        if (animal != null) animalsInCage.remove(animal);
        return animal;
    }

    /**Перевод животного в другую клетку*/
    public boolean transferAnimal(T animal, Cage<T> cageTo){
        if (cageTo.isFreePlaces()){
            animalsInCage.remove(animal);
            cageTo.addAnimal(animal);
            return true;
        }
        return false;
    }
}
