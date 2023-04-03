package learn.java.threads.example.islandAnimals;

import learn.java.threads.example.islandAnimals.animals.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Island {
    private Cell[][] cells = new Cell[10][20];

    private Random random = new Random();

    public Island() {
        // заполнение каждой клетки случайными объектами животных и растений
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = new Cell(); // каждая клетка содержит одну порцию травы
                fillCell(cell);
                cells[i][j] = cell;
            }
        }
    }

    public Animal getRandomAnimalFromCell(int row, int column) {
        return cells[row][column].getRandomAnimal();
    }

    private void fillCell(Cell cell) {
        int animalCount = ThreadLocalRandom.current().nextInt(20, 100); // случайное количество животных в клетке
        for (int k = 0; k < animalCount; k++) {
            Animal animal = createRandomAnimal();
            if (animal != null) cell.addAnimal(animal); // добавляем животное в клетку
        }
    }

    private Animal createRandomAnimal() {
        int rand = ThreadLocalRandom.current().nextInt(5);
        switch (rand) {
            case 0 -> {
                return new Wolf();
            }
            case 1 -> {
                return new Bear();
            }
            case 2 -> {
                return new Duck();
            }
            case 3 -> {
                return new Caterpillar();
            }
            case 4 -> {
                return new Horse();
            }

        }
        return null;
    }

    private boolean canMove(int row, int column) {
        if (row >= cells.length || row < 0) return false;
        if (column >= cells[row].length || column < 0) return false;

        return true;
    }

    public void prepare(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].prepare();
            }
        }
    }
    /**
     * Перемещение животного
     */
    public void moveAnimals() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                HashMap<Kind, ArrayList<Animal>> animalsInCell = cells[i][j].getAnimals();  //Животные в ячейке
                for (Map.Entry<Kind, ArrayList<Animal>> entry : animalsInCell.entrySet()) {
                    ArrayList<Animal> listAnimal = new ArrayList<>(entry.getValue());
                    for (Animal animal : listAnimal) {
                        int speed = animal.getKind().getSpeed();
                        int rowTo = i, columnTo = j;
                        for (int k = 0; k < speed; k++) {
                            Side side = Side.getRandomSide();
                            if (canMove(rowTo + side.rowTo, columnTo + side.columnTo)) {
                                if (cells[rowTo + side.rowTo][columnTo + side.columnTo].canMove(animal)){
                                    rowTo += side.rowTo;
                                    columnTo += side.columnTo;
                                }
                            }
                        }

                        if (i != rowTo || j != columnTo) {
                            animal.setMoved(true);
                            cells[i][j].removeAnimal(animal);
                            cells[rowTo][columnTo].addAnimal(animal);
                            System.out.println(animal + " перемещён в ячейку " + rowTo + " " + columnTo);
                        }
                    }
                }
            }
        }
    }

    /**
     * Функция трапезы всех животных острова
     * */
    public void mealTime() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                HashMap<Kind, ArrayList<Animal>> animalsInCell = cells[i][j].getAnimals();
                for (Map.Entry<Kind, ArrayList<Animal>> entry : animalsInCell.entrySet()) {
                    ArrayList<Animal> listAnimal = new ArrayList<>(entry.getValue());
                    for (Animal animal : listAnimal) {
                        //TODO: Реализовать поедание травы. Разработать правильную структуру
//                        if (animal instanceof Herbivore){
//                            Herbivore herbivore = (Herbivore) animal;
//                            herbivore.eat();
//                        }
                        Animal victim = cells[i][j].getRandomAnimal();
                        if (victim != null && animal.eat(victim)) {
                            cells[i][j].removeAnimal(victim);
                            System.out.println(animal + " съел " + victim);
                        } else if (animal.getSatiety() <= 0) {
                            cells[i][j].removeAnimal(animal);
                            System.out.println(animal + " погибает от голода");
                        }
                    }
                }
            }
        }
    }


    public void multiply(){
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                cells[i][j].multiply();
            }
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
