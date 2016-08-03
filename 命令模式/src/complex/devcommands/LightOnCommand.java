package complex.devcommands;

import complex.dev.Light;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.on();
    }
}
