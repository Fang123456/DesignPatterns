import Beverage.Beverage;
import Beverage.DarkRoast;
import Beverage.Espresso;
import Beverage.HouseBlend;
import decorator.Mocha;
import decorator.Whip;
import decorator.Soy;


/**
 * Created by AAAAA on 2016/3/16.
 */
public class main {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        //beverage2 = new Mocha(beverage2);
       // beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + (beverage2.cost() + 0.2D));

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
