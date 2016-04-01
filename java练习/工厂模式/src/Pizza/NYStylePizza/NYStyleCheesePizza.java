package Pizza.NYStylePizza;

import Pizza.Pizza;
import PizzaStore.PizzaStore;

import java.util.ArrayList;

/**
 * Created by AAAAA on 2016/3/24.
 */
public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
//        dough = "Thin Crust Dough";
//        sauce = "Marinara Sauce";

        topping.add("Grated Reggiano Cheese");
    }

    @Override
    public void prepare() {

    }
}
