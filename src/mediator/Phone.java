package mediator;

public class Phone implements Controllable{
    private Mediator mediator;
    private boolean dontDisturbMode = false;
    public void callReceive(){
        mediator.callReceive();}

    public void turnOnDontDisturbMode(){
        System.out.println("Phone stay in dont disturb mode");
        dontDisturbMode = true;
    }

    public void turnOffDontDisturbMode(){
        System.out.println("Phone stay in disturb mode");
        dontDisturbMode = false;
    }
    public boolean getPhoneMode(){
        System.out.println("is the phone in dont disturb mode? : " + dontDisturbMode);
        return dontDisturbMode;
    }
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
