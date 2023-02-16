package learn.java.oop.examples.microwave;

public class Microwave {

	State state = State.INACTIVE;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void addTime() {
		this.state.addTime(this);
	}

	public void openDoor() {
		this.state.openDoor(this);

	}

	public void closeDoor() {
		this.state.closeDoor(this);
	}

	public void startMicrowaving() {
		this.state.startMicrowaving(this);

	}

	public void timerUp() {
		this.state.timerUp(this);
	}

	void beep() {
		System.out.println("beeeeep! [^.^]");
	}

	void boop() {
		System.out.println("boooop?! [O.o]");
	}

	private void mjamm() {
		System.out.println("nom nom! [-0-]");
	}
}
