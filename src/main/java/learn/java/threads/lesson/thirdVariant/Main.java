package learn.java.threads.lesson.thirdVariant;

public class Main {
    public static void main(String[] args) {
        //Анонимная функция, создаваемая по месту, для выполнения локальных действий
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Поток: " + i);
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Main: " + i);
        }
    }
}
