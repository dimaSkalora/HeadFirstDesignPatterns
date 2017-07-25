package gumball_monitor;

import java.rmi.*;
 
public class GumballMonitorTestDrive {
 
	public static void main(String[] args) {
		//Место нахождение всех автоматов, которые мы собираемся отслежывать
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
		                     "rmi://boulder.mightygumball.com/gumballmachine",
		                     "rmi://seattle.mightygumball.com/gumballmachine"}; 
		
		if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
        }
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		
		//тепер нужно получить заместителя для каждолго автомата
		for (int i=0;i < location.length; i++) {
			try {
           		GumballMachineRemote machine = 
						(GumballMachineRemote) Naming.lookup(location[i]);
           		monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}

		//перебираем автоматы и для каждого выводим отчет
		for(int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
