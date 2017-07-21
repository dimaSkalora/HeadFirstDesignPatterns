package control_remote.remote.command.command_on;

import control_remote.remote.cell_remote.TV;
import control_remote.remote.command.Command;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}
}
