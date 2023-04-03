package learn.java.oop.examples.generics_chest;

import java.util.List;

/**СундукЦ*/
public class Chest<T extends Treasure> {
    private T savingItem;

    public Chest(T savingItem) {
        this.savingItem = savingItem;
    }

    public T getSavingItem() { return savingItem; }
}
