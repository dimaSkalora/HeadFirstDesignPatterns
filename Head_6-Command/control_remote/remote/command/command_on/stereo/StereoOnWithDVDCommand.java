package control_remote.remote.command.command_on.stereo;

import control_remote.remote.cell_remote.Stereo;
import control_remote.remote.command.Command;

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
}
