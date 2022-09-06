package backers.patterns.structural.bridge.program;

import backers.patterns.structural.bridge.entity.Developer;

public class FactoryProgram extends Program{
    public FactoryProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Factory program in developing process");
        developer.developProgram();
    }
}
