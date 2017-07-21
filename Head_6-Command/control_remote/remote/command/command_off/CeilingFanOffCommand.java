package control_remote.remote.command.command_off;

import control_remote.remote.cell_remote.CeilingFan;
import control_remote.remote.command.Command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.off();
    }
}
