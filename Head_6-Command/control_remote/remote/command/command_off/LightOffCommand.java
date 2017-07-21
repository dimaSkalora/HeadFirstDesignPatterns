package control_remote.remote.command.command_off;

import control_remote.remote.cell_remote.Light;
import control_remote.remote.command.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
