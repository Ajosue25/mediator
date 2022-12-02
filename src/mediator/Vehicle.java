package mediator;

public class Vehicle implements Controllable {
        private Mediator mediator;

        public void turnOnVehicle() {
            this.mediator.turnOnVehicle();
            System.out.println("turning on vehicle");
        }

        public void turnOffVehicle() {
            this.mediator.turnOffVehicle();
            System.out.println("turning off vehicle");
        }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
