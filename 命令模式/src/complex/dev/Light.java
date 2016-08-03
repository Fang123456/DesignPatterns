package complex.dev;

/**
 * Created by AAAAA on 2016/5/3.
 * 灯
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() { System.out.println(name + "'s light is on"); }

    public void off(){ System.out.println(name + "'s light is off"); }
}
