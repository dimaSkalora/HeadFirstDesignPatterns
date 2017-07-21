package control_remote.remote.command.command_on.stereo;

import control_remote.remote.cell_remote.Stereo;
import control_remote.remote.command.Command;

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
}
