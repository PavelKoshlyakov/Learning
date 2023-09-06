package learn.java.threads.t5_deadlock;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();

        second.setFirst(first);
        first.setSecond(second);

        MyThread1 myThread1 = new MyThread1(first);
        MyThread2 myThread2 = new MyThread2(second);

        myThread1.start();
        myThread2.start();
    }
}

class MyThread1 extends Thread{
    private First first;

    public MyThread1(First footballPlayer) {
        this.first = footballPlayer;
    }

    @Override
    public void run() {
        System.out.println(first.getSecondValue());
    }
}

class MyThread2 extends Thread{
    private Second second;

    public MyThread2(Second second) {
        this.second = second;
    }

    @Override
    public void run() {
        System.out.println(second.getFirstValue());
    }
}


class First{
    private Second second;

    public void setSecond(Second second) { this.second = second; }
    public synchronized int getSecondValue(){
        return second.getValue();
    }

    public synchronized int getValue(){
        return 1;
    }
}

class Second{
    private First first;

    public void setFirst(First first) { this.first = first; }

    public synchronized int getFirstValue(){
        return first.getValue();
    }
    public synchronized int getValue(){
        return 2;
    }
}
