package control_remote.undo;

import control_remote.undo.cell_remote.CeilingFan;
import control_remote.undo.cell_remote.GarageDoor;
import control_remote.undo.cell_remote.Light;
import control_remote.undo.cell_remote.Stereo;
import control_remote.undo.command.command_off.CeilingFanOffCommand;
import control_remote.undo.command.command_off.GarageDoorDownCommand;
import control_remote.undo.command.command_off.LightOffCommand;
import control_remote.undo.command.command_off.StereoOffCommand;
import control_remote.undo.command.command_on.*;
import control_remote.undo.command.command_on.stereo.StereoOnWithCDCommand;

//оздает обьекты команд, связываемые с ячейками пульта.
// Каждый обьект команды инкапсилирует запрос к некоторому устройсктву
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        //Включение, выключение и отмена
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        //Выключение, включение и отмена
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium =
                new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh =
                new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        //Сначала аключаем среднию скорость
        remoteControl.onButtonWasPushed(0);
        //Потом выключаем вентелятор
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        //Отмена! Снова должна включится средняя скорость
        remoteControl.undoButtonWasPushed();

        //На этот раз выбираем высокую скорость
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        //И снова отмена, должна вернутся средняя скорость
        remoteControl.undoButtonWasPushed();
    }
}
