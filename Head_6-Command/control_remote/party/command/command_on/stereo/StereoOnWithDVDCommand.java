package control_remote.party.command.command_on.stereo;

import control_remote.party.cell_remote.Stereo;
import control_remote.party.command.Command;

public class StereoOnWithDVDCommand implements Command {
    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDVD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
