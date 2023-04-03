package learn.java.threads.example.islandAnimals;

import learn.java.threads.example.islandAnimals.animals.Animal;
import learn.java.threads.example.islandAnimals.animals.Gender;
import learn.java.threads.example.islandAnimals.animals.Grass;
import learn.java.threads.example.islandAnimals.animals.Kind;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Cell {

    private HashMap<Kind, ArrayList<Animal>> animals = new HashMap<>();
    private HashMap<Grass, Integer> grasses = new HashMap<>();

    public Cell() {
        Grass grass = new Grass();
        grasses.put(grass, grass.getMaxQuantityByCell());
    }

    public HashMap<Kind, ArrayList<Animal>> getAnimals() {
        return new HashMap<>(animals);
    }

    /**
     * Проверка содержания животного в ячейке
     *
     * @param animal Животное, наличие которого проверяется
     * @return true - если животное в ячейке, false - в противном случае
     */
    public boolean isAnimalContains(Animal animal) {
        Kind kind = animal.getKind();
        if (animals.containsKey(kind)) {                         //Если такой вид есть в клетке
            ArrayList<Animal> animalList = animals.get(kind);
            return animalList.contains(animal);                 //Если данное животное есть в клетке
        }
        return false;
    }

    /**
     * Добавление животного в список
     *
     * @param animal Добавляемое животное
     */
    public void addAnimal(Animal animal) {
        Kind kindAnimal = animal.getKind();
//        if (isAnimalContains(animal)) {
        if (animals.containsKey(kindAnimal)) {
            ArrayList<Animal> list = animals.get(kindAnimal);

            if (list.size() >= animal.getKind().getMaxQuantityByCell()) return;

            list.add(animal);
            animals.put(kindAnimal, list);
        } else {
            ArrayList<Animal> list = new ArrayList<>();
            list.add(animal);
            animals.put(kindAnimal, list);
        }
    }

    /**
     * Функция определяет, можно ли животному переместиться в ячейку
     *
     * @param animal перемещаемое животное
     * @return true, если перемещение возможно, false - если невозможно
     */
    public boolean canMove(Animal animal) {
        if (animal.isMoved()) return false;

        Kind kindAnimal = animal.getKind();

        return isFreePlace(kindAnimal);
    }

    public boolean isFreePlace(Kind kindAnimal){
        if (!animals.containsKey(kindAnimal)) return true;

        ArrayList<Animal> animalsKindInCell = animals.get(kindAnimal);

        return animalsKindInCell.size() < kindAnimal.getMaxQuantityByCell();
    }

    public int getSizeAllAnimals() {
        int result = 0;
        for (ArrayList<Animal> animalList : animals.values()) {
            result += animalList.size();
        }
        return result;
    }


    /**Размножение в клетке*/
    public void multiply(){
        for (Kind kind : animals.keySet()){
            if (!isFreePlace(kind)) continue;

            ArrayList<Animal> animalMaleList = getListAnimal(kind, Gender.MALE);
            ArrayList<Animal> animalFemaleList = getListAnimal(kind, Gender.FEMALE);


            for (Animal male : animalMaleList){
//                while (index < animalFemaleList.size() && animalFemaleList.get(index).isMultiply()){    //Поиск женских особей не участвовавших в размножении
//                    index++;
//                }
//                if (index >= animalMaleList.size()) break;
//
//                Animal female = animalFemaleList.get(index++);
                if (animalFemaleList.size() == 0) break;
                Animal female = animalFemaleList.get(0);
                animalFemaleList.remove(0);

                Animal child = male.multiply(female);
                addAnimal(child);
                System.out.println("Родился " + child);
            }
        }
    }

    /**
     * Получение случайного животного из ячейки.
     *
     * @return Animal, если в ячейке есть подходящее животное, иначе null
     */
    public Animal getRandomAnimal() {
        if (getSizeAllAnimals() < 2) return null;

        ArrayList<Animal> animalsList = new ArrayList<>();
        while (animalsList == null || animalsList.size() == 0) {
            Kind randomKind = Kind.BEAR.getRandomKind();
            animalsList = animals.get(randomKind);
        }

        int randomAnimal = ThreadLocalRandom.current().nextInt(animalsList.size());
        return animalsList.get(randomAnimal);
    }

    public ArrayList<Animal> getListAnimal(Kind kind, Gender gender){
        if (!animals.containsKey(kind)) return new ArrayList<>();

        List<Animal> animalList = animals.get(kind);
        return animalList.stream().filter(x -> x.getGender() == gender).collect(Collectors.toCollection(ArrayList::new));
    }

    public void removeAnimal(Animal animal) {
        ArrayList<Animal> animalsList = animals.get(animal.getKind());
        animalsList.remove(animal);
    }

    public void prepare() {
        for (ArrayList<Animal> animalsList : animals.values()){
            for (Animal animal : animalsList){
                animal.setMultiply(false);
                animal.setMultiply(false);
            }
        }
    }
}
