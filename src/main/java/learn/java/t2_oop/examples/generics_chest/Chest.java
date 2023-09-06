package learn.java.t2_oop.examples.generics_chest;

/**СундукЦ*/
public class Chest<T extends Treasure> {
    private T savingItem;

    public Chest(T savingItem) {
        this.savingItem = savingItem;
    }

    public T getSavingItem() { return savingItem; }
}
