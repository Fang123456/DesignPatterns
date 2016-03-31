package Pizza;

import Pizza.NYStylePizza.NYStyleCheesePizza;
import PizzaStore.PizzaStore;

import java.util.ArrayList;

/**
 * Created by AAAAA on 2016/3/24.
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList topping = new ArrayList();

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Topping：");
        for (int i=0; i<topping.size(); i++){
            System.out.print("  " + topping.get(i));
        }
    }
    //烘烤
    public void bake(){
        System.out.println("Baking for 25 minutes at 350");
    };

    //切块
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };

    //装箱
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName() {
        return name;
    }

}
