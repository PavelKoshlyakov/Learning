package learn.java.t2_oop.lessons.iterable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;

public class School implements Iterable<String>{
    private ArrayList<String> students;
    private int index = 0;

    public School(ArrayList<String> students){
        this.students = students;
    }


//    @Override
//    public boolean hasNext() {
//        return index < students.size();
//    }
//
//    @Override
//    public String next() {
//        return students.get(index++);
//    }

    @NotNull
    @Override
    public Iterator<String> iterator() {
        return students.iterator();
    }
}
