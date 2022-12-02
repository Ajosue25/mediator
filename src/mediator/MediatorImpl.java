package mediator;

public class MediatorImpl implements Mediator{
    private Vehicle vehicle;
    private Radio radio;
    private Phone phone;

    @Override
    public void turnOnVehicle() {
        radio.turnOnRadio();
        phone.turnOnDontDisturbMode();
    }

    @Override
    public void turnOffVehicle(){
        radio.turnOffRadio();
    }

    @Override
    public void turnOnRadio() {
        phone.turnOnDontDisturbMode();
    }

    @Override
    public void callReceive() {
        radio.turnOffRadio();
    }

    public void setVehicle(Controllable vehicle) {
        this.vehicle = (Vehicle) vehicle;
        this.vehicle.setMediator(this);
    }

    public void setRadio(Controllable radio) {
        this.radio = (Radio) radio;
        this.radio.setMediator(this);
    }

    public void setPhone(Controllable phone) {
        this.phone = (Phone) phone;
        this.phone.setMediator(this);
    }
}
