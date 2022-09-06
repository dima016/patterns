package backers.patterns.structural.bridge.program;

import backers.patterns.structural.bridge.entity.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
