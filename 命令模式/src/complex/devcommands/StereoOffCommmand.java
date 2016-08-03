package complex.devcommands;

import complex.dev.Stereo;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
public class StereoOffCommmand implements Command{
    Stereo stereo;

    public StereoOffCommmand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
