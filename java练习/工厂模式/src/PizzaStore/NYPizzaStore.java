package PizzaStore;

import Pizza.NYStylePizza.NYStylePepperoniPizza;
import Pizza.NYStylePizza.NYStyleCheesePizza;
import Pizza.Pizza;
import Pizza.CheesePizza;
import PizzaIngredientFactory.PizzaIngredientFactory;
import PizzaIngredientFactory.NYPizzaIngredientFactory;

/**
 * Created by AAAAA on 2016/3/24.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){

            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style pizza");

        }
        return pizza;
//        if (item.equals("cheese")){
//            return new NYStyleCheesePizza();
//        } else if (item.equals("Pepperoni")){
//            return new NYStylePepperoniPizza();
//        } else return null;
    }

    @Override
    public void prepare() {

    }
}
