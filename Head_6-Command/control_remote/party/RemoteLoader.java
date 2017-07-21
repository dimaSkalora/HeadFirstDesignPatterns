package control_remote.party;


import control_remote.party.cell_remote.Hottub;
import control_remote.party.cell_remote.Light;
import control_remote.party.cell_remote.Stereo;
import control_remote.party.cell_remote.TV;
import control_remote.party.command.Command;
import control_remote.party.command.MacroCommand;
import control_remote.party.command.command_off.HottubOffCommand;
import control_remote.party.command.command_off.LightOffCommand;
import control_remote.party.command.command_off.StereoOffCommand;
import control_remote.party.command.command_off.TVOffCommand;
import control_remote.party.command.command_on.HottubOnCommand;
import control_remote.party.command.command_on.LightOnCommand;
import control_remote.party.command.command_on.TVOnCommand;
import control_remote.party.command.command_on.stereo.StereoOnCommand;

//оздает обьекты команд, связываемые с ячейками пульта.
// Каждый обьект команды инкапсилирует запрос к некоторому устройсктву
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //Создание обьектов устройств(свет, телевизор, стерео, джакузи)
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        //Создание команд включения для управления этими устройствами
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        //Создание команд выключения для управления этими устройствами
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        //Массивы команд включения и выключения
        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        //Маркокоманда связывается с кнопкой как и любая другая команда
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        //Результат
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }

}
