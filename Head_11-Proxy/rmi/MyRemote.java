package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Сервер
//Интерфейс удаленного доступа
//Все возвращаемые типы должны быть примитивными или Serializable
public interface MyRemote extends Remote{
    String sayHello() throws RemoteException;
}
