package control_remote.remote;

import control_remote.remote.cell_remote.*;
import control_remote.remote.command.command_off.*;
import control_remote.remote.command.command_on.*;
import control_remote.remote.command.command_on.stereo.StereoOnWithCDCommand;

//оздает обьекты команд, связываемые с ячейками пульта.
// Каждый обьект команды инкапсилирует запрос к некоторому устройсктву
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //Создание всех устроиств
        Light livingRoomLight = new Light("Living Room");
        TV tv = new TV("Samsung");
        Hottub hottub = new Hottub();
        CeilingFan ceilingFan= new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        //Создание команнд для управления освещением
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        //Создание команд для управление TV
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        //Создание команед для управления джакузи
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        //Создание команд для управления потолочным вентелятором
        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        //Создание команд для управления дверью гаража
        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        //Создание команд для управления стереосистемой
        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        //Готовые команды связываются с ячейками пульта
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, tvOnCommand, tvOffCommand);
        remoteControl.setCommand(2, hottubOnCommand, hottubOffCommand);
        remoteControl.setCommand(3, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(5, stereoOnWithCD, stereoOff);

        //Выводит список ячеек и связаных с ними команд
        System.out.println(remoteControl);

        //Пульт готов к проверке! Перебираем все ячейки, и для каждой ячейки имитируем нажаттие кнопок "вкл" и "выкл"
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }

}
