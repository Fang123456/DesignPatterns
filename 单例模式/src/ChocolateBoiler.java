/**
 * Created by AAAAA on 2016/4/29.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler INSTANCE;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    };

    public static ChocolateBoiler getInstance(){
        if (INSTANCE == null){
             INSTANCE = new ChocolateBoiler();
        }
        return INSTANCE;
    }
}
