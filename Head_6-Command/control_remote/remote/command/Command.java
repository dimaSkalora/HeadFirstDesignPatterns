package control_remote.remote.command;

//Все команды RemoteControl реализуют интерфейс команды, состоящий из единственого метода execute().
//Команды инкапсулируют набор операций с класом устройстваю
//Пульт активирует эти операциии вызовом метода execute(0
public interface Command{
    void execute();
}
