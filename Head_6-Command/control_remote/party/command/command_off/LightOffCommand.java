package control_remote.party.command.command_off;

import control_remote.party.cell_remote.Light;
import control_remote.party.command.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
