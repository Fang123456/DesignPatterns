package composite;

import composite.menu.MenuComponent;
import composite.menu.MenuItem;
import composite.menu.Menu;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
