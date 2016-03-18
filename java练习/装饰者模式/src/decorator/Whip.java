package decorator;

import Beverage.Beverage;
import decorator.CondimentDecorator;

/**
 * Created by AAAAA on 2016/3/16.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", decorator.Whip";
    }
    public double cost() {
        return .30 + beverage.cost();
    }
}
