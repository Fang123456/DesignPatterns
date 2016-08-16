/**
 * Created by Administrator on 2016/8/16 0016.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //这个判断语句俗称钩子。
        if (customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boil Water");
    }

    void pourInCup(){
        System.out.println("Boil into Water");
    }

    boolean customerWantsCondiments(){
        return  true;
    }
}
