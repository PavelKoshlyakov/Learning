package learn.java.threads;

public class AtomicThread implements Runnable{
    static int i;
    @Override
    public void run() {
        i++;
    }
}
