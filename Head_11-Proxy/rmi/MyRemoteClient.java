package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

//Клиент
public class MyRemoteClient {
    public static void main(String[] args) {

    }

    public void go(){
        try {
            //Возвращается из реестра ввиде типа Object, не забудте выполнить переобразование
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            //Выглядить как обычный вызов метода!(кроме подтверждения возможности RemoteException
            String s = service.sayHello();
            System.out.println(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
