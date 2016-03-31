import Pizza.Pizza;
import PizzaStore.PizzaStore;
import PizzaStore.NYPizzaStore;

/**
 * Created by AAAAA on 2016/3/25.
 */
public class main {
    public static void main(String[] args) {
        PizzaStore  nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("This is the pizza" + pizza.getName());

    }
}

