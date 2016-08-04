package adapter;

import adapter.duck.DuckOne;
import adapter.duck.TurkeyAdapter;
import adapter.turkey.Turkey;
import adapter.turkey.TurkeyOne;

/**
 * Created by Administrator on 2016/8/4 0004.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        //鸭子叫
        DuckOne duckOne = new DuckOne();
        duckOne.quack();
        duckOne.fly();

        //火鸡叫
        TurkeyOne turkeyOne = new TurkeyOne();
        turkeyOne.gobble();
        turkeyOne.fly();

        //直接用Duck接口，显然不合适，写个适配器就好了。
        TurkeyOne turkeyTwo = new TurkeyOne();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkeyTwo);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
