import iterface.impl.BreakfastMenu;
import iterface.Menu;
import iterface.impl.DinerMenu;

/**
 * Created by Administrator on 2016/8/17 0017.
 */
public class Test {
    public static void main(String[] args) {
        Menu breakfastMenu = new BreakfastMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(breakfastMenu, dinerMenu);
        waitress.printMenu();
    }
}
