package control_remote.undo.command.command_on;

import control_remote.undo.cell_remote.CeilingFan;
import control_remote.undo.command.Command;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {

    }
}
