package learn.java.oop.examples.oop_base_shop;

public class Shop {
    /**Прибыль*/
    private double profit;

    public double getProfit() { return profit; }

    /**Метод продажи
     * @param human покупатель
     * @param item продаваемый товар
     * @return true, если товар продали или false, если продажа не удалась*/
    public boolean sell(Human human, Item item){
        double price = item.getCost();

        if (human.getMoney()< price) return false;
        if (human.getAge() < item.getMinAgeToBuy()) return false;

        human.spendMoney(price);
        this.profit += price;
        return true;
    }

    public boolean sell(Human human, Item item, int count){
        double price = item.getCost() * count;

        if (human.getMoney()< price) return false;
        if (human.getAge() < item.getMinAgeToBuy()) return false;

        human.spendMoney(price);
        this.profit += price;
        return true;
    }
}
