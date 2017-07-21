package control_remote.undo.command.command_on;

import control_remote.undo.cell_remote.Light;
import control_remote.undo.command.Command;

//Реализации команды для включения света
public class LightOnCommand implements Command {
    Light light;

    //В перемной light конструктору передается конскретный обьект, котормы будет управлять
    // команда(допусти освящение в гостиной), при вызове execute получателем запроса будет обьект light
    public LightOnCommand(Light light) {
        this.light = light;
    }

    //Метод execute вызывает метод он() обьекта-получателя(тоесть осветительной системы).
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
