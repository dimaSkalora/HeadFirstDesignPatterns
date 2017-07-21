package control_remote.party.command.command_on.ceileng_fan;

import control_remote.party.cell_remote.CeilingFan;
import control_remote.party.command.Command;

public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	//Добавляем локальную переменную состояния для хрангения предидущей склорости
	int prevSpeed;
  
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
 
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
