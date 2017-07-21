package control_remote.undo.command.command_on.stereo;

import control_remote.undo.cell_remote.Stereo;
import control_remote.undo.command.Command;

public class StereoOnWithRadioCommand implements Command {
    Stereo stereo;

    public StereoOnWithRadioCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setRadio();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
