package learn.java.threads;

//public class SomeThread extends Thread {
//    String name;
//    SomeThread(String name){
//        this.name = name;
//    }
//
//    public void run(){
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(name + " " + i);
//        }
//    }
//
//}

public class SomeThread implements Runnable {
    String name;

    SomeThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10_000; i++) {
            System.out.println(name + " " + i);
        }
    }

}
