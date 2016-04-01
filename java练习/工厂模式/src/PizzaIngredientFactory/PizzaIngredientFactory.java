package PizzaIngredientFactory;

import PizzaIngredientFactory.source.Cheese.Cheese;
import PizzaIngredientFactory.source.Clams.Clams;
import PizzaIngredientFactory.source.Dough.Dough;
import PizzaIngredientFactory.source.Pepperoni.Pepperoni;
import PizzaIngredientFactory.source.Sauce.Sauce;
import PizzaIngredientFactory.source.Veggies.Veggies;

/**
 * Created by AAAAA on 2016/3/31.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();  //面团
    public Sauce createSauce();  //酱
    public Cheese createCheese();  //奶酪
    public Veggies[] createVeggies();  //蔬菜
    public Pepperoni createPepperoni();  //意大利辣味香肠
    public Clams createClams();  //蛤蜊


}
