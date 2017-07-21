package control_remote.party.command;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        //При выполнении маркокоманды все эти команды будут выполнены
        for(int i=0; i<commands.length; i++)
            commands[i].execute();
    }

    @Override
    public void undo() {
        for (int i = commands.length -1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}
