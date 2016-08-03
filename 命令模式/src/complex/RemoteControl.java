package complex;

import complex.devcommands.Command;
import complex.devcommands.NoCommand;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int solt, Command onCommand, Command offCommand) {
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }

    public void onButtonWasPushed(int solt) {
        onCommands[solt].execute();
        undoCommand = onCommands[solt];
    }

    public void offButtonWasPushed(int solt) {
        offCommands[solt].execute();
        undoCommand = offCommands[solt];
    }
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/n------Remote Control------/n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[solt" + i + "]" + onCommands.getClass().getName()
            + "  " + offCommands.getClass().getName() + "/n");
        }
        return stringBuffer.toString();
    }

}
