package learn.java.threads.collections.synchronizedList_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Some");

        MyThread thread1 = new MyThread(myList);
        MyThread thread2 = new MyThread(myList);

        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    MyList list;

    public MyThread(MyList list) { this.list = list; }

    @Override
    public void run() {
        list.removeFirst();
        System.out.println(list);
    }
}
class MyList{
    private List<String> list = Collections.synchronizedList(new ArrayList<>());

    public void add(String item){
        list.add(item);
    }

    public void removeFirst(){
        if (list.size() > 0){
            list.remove(0);
        }
    }
}
