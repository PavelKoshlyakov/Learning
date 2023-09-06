package learn.java.t2_oop.examples.generics_container;

import learn.java.t2_oop.examples.generics_container.items.Item;

public class Container <T extends Item> extends Item{
    private int numberContainer;
    T item = null;

    public Container(int width, int height, int length, int numberContainer) {
        super(width, height, length);
        this.numberContainer = numberContainer;
    }

    public int getNumberContainer() { return numberContainer; }

    /**Метод загрузки нового объекта
     * @param item загружаемый объект
     * @return true, если удалось загрузить, false - если загрузка не удалась
     * */
    public boolean uploadItem(T item){
        if (!isPlaced(item)) return false;
        if (this.item != null) return false;

        this.item = item;
        return true;
    }

    /**Метод выгрузки объекта из контейнера
     * @return item - объект, который находится в контейнере*/
    public T unloadItem(){
        T item = this.item;
        this.item = null;
        return item;
    }

    /**Проверка возможности загрузки объекта в контейнер
     * @param item - проверяемый объект
     * @return true - если объект помещается, false - если объект не помещается
     * */
    private boolean isPlaced(T item){
        if (this.getWidth() <= item.getWidth()) return false;
        if (this.getHeight() <= item.getHeight()) return false;
        if (this.getLength() <= item.getLength()) return false;
        return true;
    }


    public long getSquareItem(){
        if (item == null) return 0;
        return item.getSquare();
    }

    @Override
    public String toString() {
        return "Container{" +
                "numberContainer=" + numberContainer +
                ", item=" + item +
                '}';
    }
}
