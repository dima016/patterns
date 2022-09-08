package backers.patterns.behavioral.mediator.ventilator.system;

public class Button {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }
}
