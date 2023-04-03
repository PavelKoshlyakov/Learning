package learn.java.threads.locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static int counter = 0;
    public static void main(String[] args) {

    }
}

class MyThread extends Thread{
    ReadWriteLock lock = new ReentrantReadWriteLock();
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){

        }
    }
}
