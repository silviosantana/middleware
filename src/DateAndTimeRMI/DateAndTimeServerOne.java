package DateAndTimeRMI;

import java.nio.channels.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DateAndTimeServerOne {
	
	protected DateAndTimeServerOne() throws RemoteException {
		super();
	}

	public static void main(String args[]) throws RemoteException,
			AlreadyBoundException, java.rmi.AlreadyBoundException {

		// create an instance of Date And Time
	    DateAndTimeImpl dAndT = new DateAndTimeImpl();

		// create  a Registry instance on the local host
		Registry registry1 = LocateRegistry.getRegistry("localhost",2017);

		System.out.println("Date and Time server is ready!");

		// register the instance of Date and Time in the Naming Service
		registry1.bind("DateAndTime", dAndT);
	}
}
