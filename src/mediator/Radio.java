package mediator;

public class Radio implements Controllable  {

	private Mediator mediator;
	private boolean isRadioTurnedOn = false;

	public void turnOnRadio() {
		System.out.println("turn on radio");
		isRadioTurnedOn = true;
		mediator.turnOnRadio();
	}

	public void turnOffRadio() {
		System.out.println("turn off radio");
		isRadioTurnedOn = false;
	}

	public boolean isRadioOn() {
		System.out.println("the radio is on?: " + isRadioTurnedOn);
		return isRadioTurnedOn;
	}


	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
}
