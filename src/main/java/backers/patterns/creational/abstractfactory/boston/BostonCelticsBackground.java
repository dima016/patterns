package backers.patterns.creational.abstractfactory.boston;

import backers.patterns.creational.abstractfactory.Background;

public class BostonCelticsBackground implements Background {
    @Override
    public String founded() {
        return "1946";
    }

    @Override
    public String city() {
        return "Boston";
    }

    @Override
    public String arena() {
        return "TD Garden";
    }
}
