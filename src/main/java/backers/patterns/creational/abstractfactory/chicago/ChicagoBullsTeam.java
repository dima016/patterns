package backers.patterns.creational.abstractfactory.chicago;

import backers.patterns.creational.abstractfactory.Background;
import backers.patterns.creational.abstractfactory.CoachingStaff;
import backers.patterns.creational.abstractfactory.Team;

public class ChicagoBullsTeam implements Team {

    @Override
    public String getName() {
        return "CHICAGO BULLS";
    }

    @Override
    public Background getBackground() {
        return new ChicagoBullsBackground();
    }

    @Override
    public CoachingStaff getCoachingStaff() {
        return new ChicagoBullsCoachingStaff();
    }
}
