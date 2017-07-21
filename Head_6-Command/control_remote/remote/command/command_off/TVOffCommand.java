package control_remote.remote.command.command_off;

import control_remote.remote.cell_remote.TV;
import control_remote.remote.command.Command;

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
