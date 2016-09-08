package composite;

import composite.menu.Menu;

import composite.menu.MenuComponent;
import composite.menu.MenuItem;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class Test {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancakeHouseMenu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("dinnerMenu", "lunch");
        MenuComponent cafeMenu = new Menu("cafeMenu", "cafe");
        MenuComponent dessert = new Menu("dessertMenu", "dessert");

        MenuComponent allMenus = new Menu("all menus", "all menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        dinnerMenu.add(new MenuItem(
              "dinner1", "dinner1 description", true, 1.111
        ));

        dinnerMenu.add(dessert);

        dessert.add(new MenuItem(
                "dessert2", "dessert2 description", true, 2.22
        ));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
