package control_remote.remote.command.command_on;

import control_remote.remote.cell_remote.CeilingFan;
import control_remote.remote.command.Command;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.high();
    }
}
