import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2016/8/16 0016.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dropping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return  true;
        }else{
            return  false;
        }

    }

    private String getUserInput() {
        String answer = null;

        System.out.println("加糖和牛奶吗(y/n)?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader == null){
            return  "no";
        }
        return answer;
    }
}
