package control_remote.undo.command.command_off;

import control_remote.undo.cell_remote.Stereo;
import control_remote.undo.command.Command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
