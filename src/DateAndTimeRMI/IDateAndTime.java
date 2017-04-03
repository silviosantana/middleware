package DateAndTimeRMI;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDateAndTime extends Remote {
	
	//parameter can be: 'hour', 'min' or 'sec'
	int time (String p1) throws RemoteException;
	
	//parameter can be: 'day', 'mon' or 'year'
	String date (String p1) throws RemoteException, NotBoundException;

}
