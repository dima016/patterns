package backers.patterns.creational.abstractfactory;

import backers.patterns.creational.abstractfactory.boston.BostonCelticsTeam;
import backers.patterns.creational.abstractfactory.chicago.ChicagoBullsTeam;

public class DemoApp {
    public static void main(String[] args) {
        InfoCard bullsInfoCard = new InfoCard(new ChicagoBullsTeam());
        bullsInfoCard.displayInfo();

        InfoCard celticsInfoCard = new InfoCard(new BostonCelticsTeam());
        celticsInfoCard.displayInfo();
    }

}
