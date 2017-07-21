package control_remote.party.command.command_off;

import control_remote.party.cell_remote.TV;
import control_remote.party.command.Command;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
