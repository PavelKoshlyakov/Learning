package learn.java.t2_oop.examples.oop_base_shop;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Мария", "Марьина",  25,100_000); //Создание объекта класса Human
        Human human2 = new Human("Иван", "Иванов",  18,10_000); //Создание объекта класса Human
        Human human3 = new Human("Пётр", "Петров",  17,15_500); //Создание объекта класса Human

        Item item1 = new Item("Молоко", 100);
        Item item2 = new Item("Iphone 14 Pro", 120_000, 14);
        Item item3 = new Item("Вино", 550, 18);

        Shop shop = new Shop();
        boolean canBuy = shop.sell(human1, item1);
        if (canBuy){
            System.out.println(human1.getName() + " купил " + item1.getName() + ", осталось денег: " + human1.getMoney());
        } else {
            System.out.println(human1.getName() + " не может купить " + item1.getName());
        }

        canBuy = shop.sell(human2, item2);
        if (canBuy){
            System.out.println(human2.getName() + " купил " + item2.getName() + ", осталось денег: " + human2.getMoney());
        } else {
            System.out.println(human2.getName() + " не может купить " + item2.getName());
        }

        canBuy = shop.sell(human3, item3);
        if (canBuy){
            System.out.println(human3.getName() + " купил " + item3.getName() + ", осталось денег: " + human3.getMoney());
        } else {
            System.out.println(human3.getName() + " не может купить " + item3.getName());
        }
    }

}
