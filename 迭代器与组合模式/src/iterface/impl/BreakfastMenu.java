package iterface.impl;

import item.MenuItem;
import iterface.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class BreakfastMenu implements Menu {
    ArrayList menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList(); //这里是添加菜单的地方
        addItem("Breakfast", "eggs and toast", true, 2.99);
        addItem("Breakfast", "套餐 B", true, 3.99);
        addItem("Breakfast", "套餐 C", false, 4.99);
    }

    public void addItem(String name, String description, boolean vegetarian,double price ) {
        MenuItem menuItenm = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItenm);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }

    //这里还有菜单的其他方法，所以不希望改菜单
}
