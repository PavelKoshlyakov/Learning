package learn.java.t2_oop.examples.interfaces.port.interfaces;

public interface Sizable {
    double getWidth();
    double getHeight();
    double getLength();
    default double getVolume(){
        return getWidth() * getHeight() * getLength();
    }
}
