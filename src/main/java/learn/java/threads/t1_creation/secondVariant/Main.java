package learn.java.threads.t1_creation.secondVariant;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread("Поток1"));
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }

    }
}

class MyThread implements Runnable{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public String getName() {
        return name;
    }
}
