/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
