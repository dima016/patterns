package backers.patterns.structural.bridge.program;

import backers.patterns.structural.bridge.entity.Developer;

public class StockProgram extends Program {
    public StockProgram(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock program in developing process");
        developer.developProgram();
    }
}
