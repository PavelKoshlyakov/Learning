package learn.java.t2_oop.examples.interfaces.port.interfaces.Container;

import learn.java.t2_oop.examples.interfaces.port.interfaces.Sizable;
import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.Transportable;

public interface Container extends Sizable {
    /**Получение груза*/
    Transportable getItem();
    default boolean canLoadItem(Transportable transportable){
        return transportable.getHeight() < this.getHeight()
                && transportable.getLength() < this.getLength()
                && transportable.getWidth() < this.getWidth();
    }
}
