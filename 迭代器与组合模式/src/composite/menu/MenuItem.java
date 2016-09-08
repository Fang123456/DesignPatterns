package composite.menu;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class MenuItem extends MenuComponent{
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

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void print (){
        System.out.println(" " + getName());
        if (isVegetarian()){
            System.out.println("(v)");
        }
        System.out.println(" " + getPrice());
        System.out.println(" " + getDescription());
    }
}
