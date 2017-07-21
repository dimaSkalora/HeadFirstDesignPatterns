package control_remote.undo;

import control_remote.undo.command.Command;
import control_remote.undo.command.NoCommand;

//Управляет набором обьектов команд(по одному на кнопку)ю
//Класс пульта больше ничего не знает о тех класах к которым он обращается,
// так как он отделен от них обьетом команд
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    //Конструктор создает экземпляры команд и инициализирует массивы onCommands и offCommands
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    //Метод setCommand() получает ячейку и команды включения/выключения для этой ячейки.
    //Команды сохнраняются в масивах для последуйщего спользования
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    //Выводит все ячейки с соотвествующими командами. Мы воспользуемся им при тестировании пульта
    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
