package adapter.turkey;

/**
 * Created by Administrator on 2016/8/4 0004.
 * TurkeyOne 相当于Adapter，它将火鸡
 */
public class TurkeyOne implements Turkey {

    @Override
    public void gobble() {
        System.out.println("火鸡独特叫声");
    }

    @Override
    public void fly() {
        System.out.println("火鸡独特飞行模式");
    }
}
