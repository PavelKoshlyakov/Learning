package learn.java.t2_oop.examples.interfaces.port;

import learn.java.t2_oop.examples.interfaces.port.interfaces.Container.AliveContainer;
import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.AliveTransportable;
import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.Transportable;

public class BigAnimalContainer implements AliveContainer {
    AliveTransportable aliveTransportable = null;

    private double width;
    private double height;
    private double length;

    public BigAnimalContainer(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    @Override
    public void load(AliveTransportable aliveTransportable) {
        if (canLoadItem(aliveTransportable)){
            this.aliveTransportable = aliveTransportable;
        }
    }

    @Override
    public Transportable getItem() {
        return aliveTransportable;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getLength() {
        return length;
    }
}
