package backers.patterns.creational.abstractfactory.boston;

import backers.patterns.creational.abstractfactory.CoachingStaff;

public class BostonCelticsCoachingStaff implements CoachingStaff {
    @Override
    public void printHeadCoachName() {
        System.out.println("Ime Udoka");
    }

    @Override
    public void printTrainerName() {
        System.out.println("Art Horne");
    }
}
