package PizzaStore;

import Pizza.NYStylePizza.NYStylePepperoniPizza;
import Pizza.NYStylePizza.NYStyleCheesePizza;
import Pizza.Pizza;

/**
 * Created by AAAAA on 2016/3/24.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {

        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (item.equals("Pepperoni")){
            return new NYStylePepperoniPizza();
        } else return null;
    }



}
