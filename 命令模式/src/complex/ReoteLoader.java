package complex;

import complex.dev.Light;
import complex.dev.Stereo;
import complex.devcommands.LightOffCommand;
import complex.devcommands.LightOnCommand;
import complex.devcommands.StereoOffCommmand;
import complex.devcommands.StereoOnWithCDCommmand;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
public class ReoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        LightOnCommand lightOnCommand0 = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand0 = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, lightOnCommand0, lightOffCommand0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        Light kitchenRoomLight = new Light("KitchenRoom");
        LightOnCommand lightOnCommand1 = new LightOnCommand(kitchenRoomLight);
        LightOffCommand lightOffCommand1 = new LightOffCommand(kitchenRoomLight);

        remoteControl.setCommand(1, lightOnCommand1, lightOffCommand1);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        Stereo stereo = new Stereo();
        StereoOnWithCDCommmand stereoOnWithCDCommmand = new StereoOnWithCDCommmand(stereo);
        StereoOffCommmand stereoOffCommmand = new StereoOffCommmand(stereo);
        remoteControl.setCommand(2, stereoOnWithCDCommmand, stereoOffCommmand);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
