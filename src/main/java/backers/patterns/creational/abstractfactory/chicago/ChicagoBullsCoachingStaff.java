package backers.patterns.creational.abstractfactory.chicago;

import backers.patterns.creational.abstractfactory.CoachingStaff;

public class ChicagoBullsCoachingStaff implements CoachingStaff {
    @Override
    public void printHeadCoachName() {
        System.out.println("Billy Donovan");
    }

    @Override
    public void printTrainerName() {
        System.out.println("Todd Campbell");
    }
}
