package complex.devcommands;

import complex.dev.Stereo;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
public class StereoOnWithCDCommmand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommmand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
