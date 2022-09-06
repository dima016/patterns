package backers.patterns.structural.bridge.entity;

public class JavaDeveloper implements Developer {
    @Override
    public void developProgram() {
        System.out.println("Java Developer is writing code...");
    }
}
