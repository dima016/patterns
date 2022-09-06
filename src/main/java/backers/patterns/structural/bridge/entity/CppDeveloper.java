package backers.patterns.structural.bridge.entity;

public class CppDeveloper implements Developer{

    @Override
    public void developProgram() {
        System.out.println("Cpp developer is writing code....");
    }
}
