package composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add (MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }
    public void remove (MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild (int i){
        return (MenuComponent) menuComponents.get(i);
    }

    public String getName (MenuComponent menuComponent){
        return name;
    }
    public String getDescription (MenuComponent menuComponent){
        return description;
    }
    public void print(){
        System.out.println("\n " + name);
        System.out.println(", " + description);
        System.out.println("---------------------------");

        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent  menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
