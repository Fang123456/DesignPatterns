package QuackBehavior.QuackBehaviorImpl;

import QuackBehavior.QuackBehavior;

/**
 * Created by AAAAA on 2016/3/2.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
