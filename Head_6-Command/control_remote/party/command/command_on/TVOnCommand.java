package control_remote.party.command.command_on;

import control_remote.party.cell_remote.TV;
import control_remote.party.command.Command;

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
