package iterface.impl;

import item.MenuItem;
import iterface.Menu;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Diner", "lettuce and tomato", true, 2.88);
        addItem("Diner", "套餐 1", true, 3.88);
        addItem("Diner", "套餐 2", false, 4.88);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuIten = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,menu is full!Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuIten;
            numberOfItems = numberOfItems + 1;
        }
    }

//    public a.MenuItem[] getMenuItens() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    //菜单的其他方法
}
