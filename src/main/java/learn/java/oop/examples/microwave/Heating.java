package learn.java.oop.examples.microwave;


public class Heating extends State {

	@Override
	public void addTime(Microwave microwave) {
		microwave.beep();
		microwave.beep();
		microwave.beep();
		microwave.state = State.HEATING;
	}

	@Override
	public void openDoor(Microwave microwave) {
		microwave.boop();
		microwave.state = State.OPEN;

	}

	@Override
	public void closeDoor(Microwave microwave) {
	}

	@Override
	public void startMicrowaving(Microwave microwave) {
		microwave.boop();
		microwave.state = State.HEATING;

	}

	@Override
	public void timerUp(Microwave microwave) {
		microwave.beep();
		microwave.state = State.INACTIVE;
	}

}