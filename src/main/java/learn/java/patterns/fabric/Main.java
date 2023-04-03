package learn.java.patterns.fabric;

import learn.java.patterns.fabric.entity.Pastry;

public class Main {
    public static void main(String[] args) {
        //Фабрика - это шаблон проектирования, который создаёт различные объекты в зависимости от некоторых условий

        Confectionery fabric = new Confectionery();

//        System.out.println(fabric.orderPastry(PastryType.CAKE));
//        System.out.println(fabric.orderPastry(PastryType.SWEET));
//        System.out.println(fabric.orderPastry(PastryType.CANDIE));

        Pastry cake = fabric.orderPastry(PastryType.CAKE);
        cake.biteOff();
        System.out.println(cake);
//
//        Pastry sweet = fabric.orderPastry(PastryType.SWEET);
//        sweet.biteOff();
//        System.out.println(sweet);
    }
}
