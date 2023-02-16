package learn.java.oop.examples.microwave;

public class Open extends State {

	@Override
	public void addTime(Microwave microwave) {
	}

	@Override
	public void openDoor(Microwave microwave) {
		microwave.setState(State.OPEN);
	}

	@Override
	public void closeDoor(Microwave microwave) {
//		microwave.closeDoor();
		microwave.state = State.INACTIVE;
	}

	@Override
	public void startMicrowaving(Microwave microwave) {
	}

	@Override
	public void timerUp(Microwave microwave) {
	}

}