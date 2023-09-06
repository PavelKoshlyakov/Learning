package learn.java.t2_oop.examples.interfaces.port.interfaces.Container;

import learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable.AliveTransportable;

public interface AliveContainer extends Container {
    void load(AliveTransportable aliveTransportable);
}
