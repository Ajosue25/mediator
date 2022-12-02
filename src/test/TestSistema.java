package test;

import static org.junit.Assert.*;

import mediator.*;
import org.junit.Before;
import org.junit.Test;

public class TestSistema {

	private Radio radio;
	private Phone phone;
	private Vehicle vehicle;

	MediatorImpl mediator = new MediatorImpl();

	@Before
	public void init() {
		radio = new Radio();
		phone = new Phone();
		vehicle = new Vehicle();

		mediator.setRadio(radio);
		mediator.setPhone(phone);
		mediator.setVehicle(vehicle);
	}

	@Test
	public void test_turn_on_off_vehicle() {

		//Mediator mediator = new MediatorImpl();
		vehicle.turnOnVehicle();

		assertTrue(radio.isRadioOn());
		assertTrue(phone.getPhoneMode());

		phone.turnOnDontDisturbMode();
		assertTrue(phone.getPhoneMode());

		vehicle.turnOnVehicle();

		assertTrue(radio.isRadioOn());
		assertTrue(phone.getPhoneMode());

		vehicle.turnOffVehicle();
		assertFalse(radio.isRadioOn());
	}

	@Test
	public void test_phone_rings() {
		radio.turnOnRadio();
		assertTrue(radio.isRadioOn());

		phone.callReceive();

		assertFalse(radio.isRadioOn());
	}

	@Test
	public void test_turn_on_radio() {

		phone.turnOnDontDisturbMode();
		assertTrue(phone.getPhoneMode());

		radio.turnOnRadio();

		assertTrue(phone.getPhoneMode());
	}
}
