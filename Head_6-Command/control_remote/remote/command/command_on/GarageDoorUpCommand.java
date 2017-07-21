package control_remote.remote.command.command_on;

import control_remote.remote.cell_remote.GarageDoor;
import control_remote.remote.command.Command;

public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
