package learn.java.oop.examples.microwave;

abstract public class State {

	public final static State INACTIVE = new Inactive();
	public final static State HEATING = new Heating();
	public final static State OPEN = new Open();

	public abstract void addTime(Microwave microwave);

	public abstract void openDoor(Microwave microwave);

	public abstract void closeDoor(Microwave microwave);

	public abstract void startMicrowaving(Microwave microwave);

	public abstract void timerUp(Microwave microwave);
}
