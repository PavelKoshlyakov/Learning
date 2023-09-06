package learn.java.t2_oop.examples.incapsulation_authorization;

/**Товар*/
public class Item {
    /**Название товара*/
    private String name;
    /**Стоимость товара*/
    private double cost;

    /**Конструктор
     * @param name Имя товара
     * @param cost Стоимость товара*/
    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }  //Данный сеттер можно и не создавать, потому что название уже существующего товара, по идее, меняться не должно.

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
