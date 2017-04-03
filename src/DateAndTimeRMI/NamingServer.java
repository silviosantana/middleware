package DateAndTimeRMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class NamingServer {
	public static void main(String[] args) throws RemoteException, InterruptedException {
		Registry registry = LocateRegistry.createRegistry(2017);
		Registry registry2 = LocateRegistry.createRegistry(2018);
		boolean running = true;

		System.out.println("Registry is ready...");

		while (running) {
		}
	}
}
