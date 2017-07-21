package control_remote.party;

import control_remote.party.command.Command;
import control_remote.party.command.NoCommand;

//Управляет набором обьектов команд(по одному на кнопку)ю
//Класс пульта больше ничего не знает о тех класах к которым он обращается,
// так как он отделен от них обьетом команд
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    //Переменая для хранения последней выполненной команды
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i=0;i<7;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        //Чтобы при нажатии кнопки отмены ранее любых других кнопок ничего не происходило
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        //При нажатие кнопки мы сначала читаем команду и выполняем ее,
        //а затем сохраняем ссылку на нее в переменой undoCommand
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        //При нажатие кнопки мы сначала читаем команду и выполняем ее,
        //а затем сохраняем ссылку на нее в переменой undoCommand
        undoCommand = offCommands[slot];
    }

    //При нажатие кнопки отмены мы вызываем метод undo() команды,
    //хранящейся в переменной undoCommandю Вызов отменяет операцию последней выполненной команды.
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuff.toString();
    }
}
