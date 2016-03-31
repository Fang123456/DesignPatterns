package PizzaStore;

import Pizza.NYStylePizza.NYStyleCheesePizza;
import Pizza.NYStylePizza.NYStylePepperoniPizza;
import Pizza.Pizza;

/**
 * Created by AAAAA on 2016/3/21.
 */
public abstract class PizzaStore extends Pizza {

    //传进一个Pizza的类型，然后做好返回
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
