package backers.patterns.behavioral.mediator;

import backers.patterns.behavioral.mediator.ventilator.system.Button;
import backers.patterns.behavioral.mediator.ventilator.system.Fan;
import backers.patterns.behavioral.mediator.ventilator.system.Mediator;
import backers.patterns.behavioral.mediator.ventilator.system.PowerSupplier;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();
        Mediator mediator = new Mediator();
        PowerSupplier powerSupplier = new PowerSupplier();

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(powerSupplier);

        button.setMediator(mediator);
        fan.setMediator(mediator);


        button.press();
        System.out.println("Is fan on = " + fan.isOn());
        button.press();
        System.out.println("Is fan on = " + fan.isOn());
    }
}
