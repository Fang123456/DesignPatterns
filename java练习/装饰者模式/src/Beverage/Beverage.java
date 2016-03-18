package Beverage;

/**
 * Created by AAAAA on 2016/3/16.
 */

/**
 * Beverage作为一个超类，无论是主题对象还是装饰着者都要继承它，请参考文件目录source*/
public abstract class Beverage {

    String description = "Unknown Beverage.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}