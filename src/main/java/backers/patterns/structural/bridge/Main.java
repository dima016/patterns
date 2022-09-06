package backers.patterns.structural.bridge;

import backers.patterns.structural.bridge.entity.*;
import backers.patterns.structural.bridge.program.FactoryProgram;
import backers.patterns.structural.bridge.program.Program;
import backers.patterns.structural.bridge.program.StockProgram;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program is started");

        Program[] programs = {
                new FactoryProgram(new JavaDeveloper()),
                new StockProgram(new CppDeveloper()),
        };

        for (Program program: programs){
            program.developProgram();
        }
    }
}
