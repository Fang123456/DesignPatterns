import Pizza.Pizza;
import Pizza.CheesePizza;
import PizzaIngredientFactory.NYPizzaIngredientFactory;
import PizzaIngredientFactory.PizzaIngredientFactory;
import PizzaStore.PizzaStore;
import PizzaStore.NYPizzaStore;

/**
 * Created by AAAAA on 2016/3/25.
 */
public class main {
    public static void main(String[] args) {
        PizzaStore  nyStore = new NYPizzaStore();
//        NYPizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = nyStore.orderPizza("cheese");
//        Pizza pizza1 = new CheesePizza(nyPizzaIngredientFactory);

        System.out.println("This is the pizza" + pizza.getName());

    }
}

