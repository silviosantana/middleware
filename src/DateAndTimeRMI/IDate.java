package DateAndTimeRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDate extends Remote{
	//parameter can be: 'day', 'mon' or 'year'
	String date (String p1) throws RemoteException;
}
