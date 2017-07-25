package gumball_monitor;

import java.rmi.RemoteException;

//Получает место нахождения автомата
public class GumballMonitor {

    GumballMachineRemote gumballMachineRemote;

    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.gumballMachineRemote = gumballMachineRemote;
    }

    //Выводить отчет с информацией о метсто нахождении, количество шариков и состояние машыны
    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachineRemote.getLocation());
            System.out.println("Current inventory: " + gumballMachineRemote.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachineRemote.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
