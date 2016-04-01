package PizzaIngredientFactory;

import PizzaIngredientFactory.source.Cheese.Cheese;
import PizzaIngredientFactory.source.Cheese.ReggianoCheese;
import PizzaIngredientFactory.source.Clams.Clams;
import PizzaIngredientFactory.source.Clams.FreshClams;
import PizzaIngredientFactory.source.Dough.Dough;
import PizzaIngredientFactory.source.Dough.ThinCrustDough;
import PizzaIngredientFactory.source.Pepperoni.Pepperoni;
import PizzaIngredientFactory.source.Pepperoni.SlicedPepperoni;
import PizzaIngredientFactory.source.Sauce.MarinaraSauce;
import PizzaIngredientFactory.source.Sauce.Sauce;
import PizzaIngredientFactory.source.Veggies.*;

/**
 * Created by AAAAA on 2016/3/31.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        Dough dough = new ThinCrustDough();
        return dough;
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
