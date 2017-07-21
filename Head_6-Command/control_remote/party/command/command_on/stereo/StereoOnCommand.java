package control_remote.party.command.command_on.stereo;

import control_remote.party.cell_remote.Stereo;
import control_remote.party.command.Command;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}
}
