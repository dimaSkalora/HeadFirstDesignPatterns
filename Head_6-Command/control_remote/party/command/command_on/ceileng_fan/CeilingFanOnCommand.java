package control_remote.party.command.command_on.ceileng_fan;

import control_remote.party.cell_remote.CeilingFan;
import control_remote.party.command.Command;

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
