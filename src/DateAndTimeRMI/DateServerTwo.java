package DateAndTimeRMI;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DateServerTwo {
	protected DateServerTwo() throws RemoteException {
		super();
	}

	public static void main(String args[]) throws RemoteException,
			AlreadyBoundException, java.rmi.AlreadyBoundException {

		// create an instance of Date
	    DateImpl date = new DateImpl();

		// create  a Registry instance on the local host
		Registry registry2 = LocateRegistry.getRegistry("localhost",2018);

		System.out.println("Date server is ready!");

		// register the instance of Date in the Naming Service
		registry2.bind("Date", date);
	}

}
