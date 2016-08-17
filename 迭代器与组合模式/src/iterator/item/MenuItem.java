package iterator.item;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class MenuItem {
    public String name;
    public String description;
    public boolean vegetarian;
    public double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
