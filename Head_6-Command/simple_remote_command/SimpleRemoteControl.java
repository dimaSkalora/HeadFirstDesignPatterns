package simple_remote_command;

import simple_remote_command.command.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    //Метод для назначение команды. Может вызватся повторно, если клиент кода
    //захочет изменить поведение кнопки.
    public void setSlot(Command command) {
        slot = command;
    }

    //Метод вызываемый при нажатии кнопки. Мы просто берем обьект команды
    // связаный с текущей ячейкой и вызываем его метод execute()
    public void buttonWasPressed(){
        slot.execute();
    }
}
