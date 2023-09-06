package learn.java.threads.collections.synchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        MyThread1 t1 = new MyThread1(list);
        MyThread2 t2 = new MyThread2(list);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t1.getList());
    }
}

class MyThread1 extends Thread {
    private List<Integer> list;

    public MyThread1(List<Integer> list) {
        this.list = list;
    }

    public ArrayList<Integer> getList() {
        return new ArrayList<>(list);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            list.add(i);
        }
    }
}

class MyThread2 extends Thread {
    private List<Integer> list;

    public MyThread2(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (list.size() != 0) list.remove(0);
        }
    }
}
