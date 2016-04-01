package Pizza;

import PizzaIngredientFactory.source.Cheese.Cheese;
import PizzaIngredientFactory.source.Dough.Dough;
import PizzaIngredientFactory.source.Pepperoni.Pepperoni;
import PizzaIngredientFactory.source.Sauce.Sauce;
import PizzaIngredientFactory.source.Veggies.Veggies;

import java.util.ArrayList;

/**
 * Created by AAAAA on 2016/3/24.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Veggies veggies[];
    public ArrayList topping = new ArrayList();

//    public void prepare(){
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough...");
//        System.out.println("Adding Sauce...");
//        System.out.println("Topping：");
//        for (int i=0; i<topping.size(); i++){
//            System.out.print("  " + topping.get(i));
//        }
//    }

    public abstract void prepare(); //用来收集Pizza用的原料

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

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        //这里是打印 pizzza的代码
        return null;
    }

}
