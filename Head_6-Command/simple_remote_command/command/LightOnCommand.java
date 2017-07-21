package simple_remote_command.command;

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
}
