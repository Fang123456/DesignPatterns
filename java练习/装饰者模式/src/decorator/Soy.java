package decorator;

import Beverage.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by AAAAA on 2016/3/16.
 */

public class Soy extends CondimentDecorator {
    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", decorator.Soy";
    }
    public double cost() {
        return 1 + beverage.cost();
    }
}
