package learn.java.oop.examples.microwave;

public class Inactive extends State {

	@Override
	public void addTime(Microwave microwave) {
		microwave.beep();
		microwave.setState(State.INACTIVE);
	}

	@Override
	public void openDoor(Microwave microwave) {

		microwave.state = State.OPEN;
	}

	@Override
	public void closeDoor(Microwave microwave) {
	}

	@Override
	public void startMicrowaving(Microwave microwave) {
		microwave.beep();
		microwave.state = State.HEATING;
	}

	@Override
	public void timerUp(Microwave microwave) {
	}

}
