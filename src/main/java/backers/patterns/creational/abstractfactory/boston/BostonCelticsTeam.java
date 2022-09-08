package backers.patterns.creational.abstractfactory.boston;

import backers.patterns.creational.abstractfactory.Background;
import backers.patterns.creational.abstractfactory.CoachingStaff;
import backers.patterns.creational.abstractfactory.Team;

public class BostonCelticsTeam implements Team {

    @Override
    public String getName() {
        return "BOSTON CELTICS";
    }

    @Override
    public Background getBackground() {
        return new BostonCelticsBackground();
    }

    @Override
    public CoachingStaff getCoachingStaff() {
        return new BostonCelticsCoachingStaff();
    }
}
