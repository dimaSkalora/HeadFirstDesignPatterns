package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Сервер
//Удаленая служба реализации
//UnicastRemoteObject - простейший способ создание обьекта с поддержкой удаленого доступа
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        //Создайте удаленный обьенкт и зарегистрируйте его в реестре RMI статическим вызовом Naming.rebing()
        //Регистрируемое имя будет использоватся клиентами для поиска обьекта в реестре
        try{
            MyRemote service= new MyRemoteImpl();
            Naming.rebind("RemoteHellp",service);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
