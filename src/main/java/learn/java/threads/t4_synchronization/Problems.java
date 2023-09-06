package learn.java.threads.t4_synchronization;

public class Problems {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread1 t1 = new Thread1(counter);
        Thread2 t2 = new Thread2(counter);

        t1.start();
//        Thread.sleep(1);
        t2.start();

        t1.join();
        t2.join();

    }
}

class Thread1 extends Thread {
    private Counter counter;

    public Thread1(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.add();
    }
}

class Thread2 extends Thread {
    private Counter counter;

    public Thread2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(counter.getCounter());
        }
    }
}

class Counter {
    private Integer counter = 0;

    public Integer getCounter() {
        return counter;
    }

//    public synchronized void add(){
//        for (int i = 0; i < 100; i++) {
//            counter += 10;
//            System.out.println("Увеличение. counter = " + counter);
//        }
//        System.out.println("Увеличение закончено!");
//    }

//    public void add(){
//        synchronized (counter){
//            for (int i = 0; i < 100; i++) {
//                counter += 10;
//                System.out.println("Увеличение. counter = " + counter);
//            }
//            System.out.println("Увеличение закончено!");
//        }
//
//    }

    public void add() {
        synchronized (counter) {
            for (int i = 0; i < 10000; i++) {
                counter += 10;
                System.out.println("Увеличение. counter = " + counter);
            }
            System.out.println("Увеличение закончено!");
        }
    }
}
