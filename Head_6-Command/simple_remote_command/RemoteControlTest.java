package simple_remote_command;

import simple_remote_command.command.GarageDoor;
import simple_remote_command.command.GarageDoorOpenCommand;
import simple_remote_command.command.Light;
import simple_remote_command.command.LightOnCommand;

//Создание простого теста
public class RemoteControlTest {
    public static void main(String[] args) {
        //Инициатор ему будет передаватся обьект команды
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //Создание обьекта Light который будет получателем запроса
        Light light = new Light();
        //Создание команды с указанием получателя
        LightOnCommand lightOn = new LightOnCommand(light);
        //Команда передается инициатору
        remote.setSlot(lightOn);
        remote.buttonWasPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();

    }
}
