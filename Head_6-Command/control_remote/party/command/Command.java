package control_remote.party.command;

//Все команды RemoteControl реализуют интерфейс команды, состоящий из единственого метода execute().
//Команды инкапсулируют набор операций с класом устройстваю
//Пульт активирует эти операциии вызовом метода execute()
public interface Command{
    void execute();
    //Метод отмены
    void undo();
}
