package complex.dev;

/**
 * Created by Administrator on 2016/8/3 0003.
 * 音响
 */
public class Stereo {
    public void off() {
        System.out.println("The Stereo is off");
    }

    public void on() {
        System.out.println("The Stereo is on");
    }

    public void setCD() {
        System.out.println("The CD is seted");
    }

    public void setVolume( int volume) {
        System.out.println("The volume is " + volume);
    }
}
