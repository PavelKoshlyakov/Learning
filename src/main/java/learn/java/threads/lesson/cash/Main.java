package learn.java.threads.lesson.cash;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        for (int i = 0; i < 1000; i++) {
            //MyThread.value = 10;
            //a = MyThread.value;
//            MyThread.value = a + 1;
            MyThread.value++;
            System.out.println("Main: " + MyThread.value);
        }
    }
}


class MyThread implements Runnable{
    public static volatile int value = 0;   //Volatile - запрет на кэширование

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            value--;
            System.out.println("Поток: " + value);
        }
    }
}
