package control_remote.remote.command.command_off;

import control_remote.remote.cell_remote.Stereo;
import control_remote.remote.command.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
