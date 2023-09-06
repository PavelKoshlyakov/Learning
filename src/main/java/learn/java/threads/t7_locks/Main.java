package learn.java.threads.t7_locks;

import java.util.PrimitiveIterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HP hpPerson = new HP();
        Thread1 t1 = new Thread1("Поток1", hpPerson);
        Thread2 t2 = new Thread2(hpPerson);
        Thread t11 = new Thread1("Поток2", hpPerson);

        t1.start();
        Thread.sleep(1);
        t2.start();
        t11.start();

        t1.join();
        t2.join();
        t1.join();
    }
}

class HP {
    private AtomicInteger value = new AtomicInteger(100);
    private Lock lock = new ReentrantLock();

    public int getValue() {
        return value.intValue();
    }

    public void getDamage() {
        lock.lock();
        value.decrementAndGet();
        System.out.println("Получен урон " + value);
        lock.unlock();
    }
}

class Thread1 extends Thread {
    private HP hp;

    public Thread1(String name, HP hp) {
        super(name);
        this.hp = hp;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName());
            hp.getDamage();
        }
    }
}

class Thread2 extends Thread {
    private HP hp;

    public Thread2(HP hp) {
        this.hp = hp;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(hp.getValue());
        }
    }
}
