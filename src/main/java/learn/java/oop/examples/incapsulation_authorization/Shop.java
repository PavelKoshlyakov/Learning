package learn.java.oop.examples.incapsulation_authorization;

import java.util.ArrayList;
import java.util.List;

/**Магазин*/
public class Shop {
    /**Список товаров*/
    private ArrayList<Item> items;

    /**Конструктор класса*/
    public Shop(){
        //Заполнение списка товаров
        items = new ArrayList<>(
                List.of(
                        new Item("Молоко", 79),
                        new Item("Хлеб", 31),
                        new Item("Печенье", 126),
                        new Item("Сахар", 63),
                        new Item("TWIX", 47)
                )
        );
    }

    /**Вывод всех товаров*/
    public void printItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    /**Добавление нового товара
     * @param item новый товар*/
    public void addItem(Item item){
        items.add(item);
    }

    /**Удаление товара
     * @param number номер удаляемого товара*/
    public void deleteItem(int number){
        items.remove(number);
    }

    /**Проверка корректности номера товара
     * @return true, если номер корректный, false - если некорректный*/
    public boolean isCurrentNumber(int number){
        return number >= 0 && number < items.size();
    }
}
