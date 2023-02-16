package learn.java.oop.lessons.iterable;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Student implements Iterable<String> {
    String name;
    String[] items = {"Математика", "Русский язык", "История", "География"};

    public Student(String name) {
        this.name = name;
    }


    @NotNull
    @Override
    public Iterator<String> iterator() {
        return new IterItems();
    }

    private class IterItems implements Iterator<String>{
        int index = 0;
        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public String next() {
            return items[index++];
        }
    }
}
