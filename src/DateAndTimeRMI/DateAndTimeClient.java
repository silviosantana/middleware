package DateAndTimeRMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DateAndTimeClient {
	public static void main(String[] args) throws RemoteException,
	NotBoundException, InterruptedException {
		
		//* obtain a reference to a bootstrap remote object registry */
		Registry registry = LocateRegistry.getRegistry("localhost", 2017);
		
		IDateAndTime dAndT = (IDateAndTime) registry.lookup("DateAndTime");
		
		System.out.println(dAndT.time("hour"));
		System.out.println(dAndT.date("day"));
	}
}
