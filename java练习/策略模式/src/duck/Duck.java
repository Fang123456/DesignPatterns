package duck;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

/**
 * Created by AAAAA on 2016/3/2.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
