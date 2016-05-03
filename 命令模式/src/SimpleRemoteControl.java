/**
 * Created by AAAAA on 2016/5/3.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand (Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
