package decorator;

import Beverage.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by AAAAA on 2016/3/16.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", decorator.Mocha";
    }
    public double cost() {
        return 0.2d + beverage.cost();
    }
}
