package learn.java.threads.pullThreads;

import org.jetbrains.annotations.NotNull;

public class MyThread extends Thread{

    public MyThread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". " + getName());
        }
    }
}
