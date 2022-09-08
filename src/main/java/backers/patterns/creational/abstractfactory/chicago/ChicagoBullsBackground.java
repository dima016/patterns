package backers.patterns.creational.abstractfactory.chicago;

import backers.patterns.creational.abstractfactory.Background;

public class ChicagoBullsBackground implements Background {
    @Override
    public String founded() {
        return "1966";
    }

    @Override
    public String city() {
        return "Chicago";
    }

    @Override
    public String arena() {
        return "United Center";
    }
}
