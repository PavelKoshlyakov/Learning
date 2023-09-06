package learn.java.threads.t4_synchronization;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

//        thread1.setResource(new Resource(0));
//        thread2.setResource(new Resource(0));
        Resource resource = new Resource(0);
        thread1.setResource(resource);
        thread2.setResource(resource);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(thread1.getResource().getQuantity());
        System.out.println(thread2.getResource().getQuantity());


    }
}

class MyThread extends Thread {
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.changeQuantity(10);
        }
    }
}

class Resource {
    private int quantity;

    public Resource(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void changeQuantity(int quantity) {
        synchronized (Resource.class) {
            System.out.println("Добавляемое значение = " + quantity);
            this.quantity += quantity;
        }
    }
}

class Calculator {

    public int sum(int a, int b) {
        synchronized (this){
            int res = a + b;
            return res;
        }
    }
}
