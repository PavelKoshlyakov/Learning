package learn.java.t2_oop.examples.interfaces.port;

import learn.java.t2_oop.examples.interfaces.port.interfaces.Container.AliveContainer;
import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.AliveTransportable;
import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.Transportable;

public class PetCarrier implements AliveContainer {

    @Override
    public void load(AliveTransportable aliveTransportable) {

    }

    @Override
    public Transportable getItem() {
        return null;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getLength() {
        return 0;
    }
}
