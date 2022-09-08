package backers.patterns.creational.abstractfactory;

public class InfoCard {

    private final String name;
    private final Background background;
    private final CoachingStaff coachingStaff;

    public InfoCard(Team team) {
        this.name = team.getName();
        this.background = team.getBackground();
        this.coachingStaff = team.getCoachingStaff();
    }

    public void displayInfo() {

        System.out.println("=================================");
        System.out.println(name);
        System.out.println("---------------------------------");
        System.out.print("Head Coach: ");
        coachingStaff.printHeadCoachName();
        System.out.print("Trainer: ");
        coachingStaff.printTrainerName();
        System.out.println("---------------------------------");
        System.out.println("Founded: " + background.founded());
        System.out.println("City: " + background.city());
        System.out.println("Arena: " + background.arena());
        System.out.println("=================================");
    }
}
