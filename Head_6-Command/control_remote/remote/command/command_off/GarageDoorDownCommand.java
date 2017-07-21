package control_remote.remote.command.command_off;

import control_remote.remote.cell_remote.GarageDoor;
import control_remote.remote.command.Command;

public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
