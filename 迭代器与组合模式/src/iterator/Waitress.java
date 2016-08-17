package iterator;

import iterator.item.MenuItem;
import iterator.iterface.Menu;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class Waitress {
    Menu breakfastMenu;
    Menu dinerMenu;

    public Waitress(Menu breakfastMenu, Menu dinerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("b.Menu\n----\nBreakfast");
        printMenu(breakfastIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", " + "  --" + menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
