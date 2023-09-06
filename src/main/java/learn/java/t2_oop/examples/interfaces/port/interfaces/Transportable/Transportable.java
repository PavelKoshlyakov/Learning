package learn.java.t2_oop.examples.interfaces.port.interfaces.Transportable;

import learn.java.t2_oop.examples.interfaces.port.interfaces.Sizable;

public interface Transportable extends Sizable {
    void load();
    double getCostTransport();

}
