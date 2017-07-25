package gumball_monitor;

import java.rmi.*;

//Все возвращаемые типы должны быть примитивными или Serializable
public interface GumballMachineRemote extends Remote {
	 int getCount() throws RemoteException;
	 String getLocation() throws RemoteException;
	 State getState() throws RemoteException;
}
