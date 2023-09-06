package learn.java.threads.t3_works;

public class Main {
    public static void main(String[] args) {
        MyThread threadMinPriority = new MyThread();
        threadMinPriority.setPriority(Thread.MIN_PRIORITY);
        threadMinPriority.start();

        MyThread threadNormalPriority = new MyThread();
        threadNormalPriority.setPriority(Thread.NORM_PRIORITY);
        threadNormalPriority.start();

        MyThread threadMaxPriority = new MyThread();
        threadMaxPriority.setPriority(Thread.MAX_PRIORITY);
        threadMaxPriority.start();

        MyThread threadSomePriority = new MyThread();
        threadSomePriority.setPriority(7);
        threadSomePriority.start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Поток с приоритетом: " + getPriority());
        }
        System.out.println("Поток с приоритетом: " + getPriority() + " почти закончил...");
        Thread.yield();
        System.out.println("Поток с приоритетом: " + getPriority() + " завершился");
    }
}
