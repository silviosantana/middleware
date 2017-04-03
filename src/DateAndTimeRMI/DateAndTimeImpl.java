package DateAndTimeRMI;

import java.util.*;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.text.*;

public class DateAndTimeImpl extends UnicastRemoteObject implements IDateAndTime {
	
	protected DateAndTimeImpl() throws RemoteException {
		super();
	}

	private SimpleDateFormat ft;
	
	private static final long serialVersionUID = 1L;
	
	public int time (String p1){
		Date dNow = new Date( );
		int result = -1;

		if(p1.equals("hour")){
			ft = new SimpleDateFormat ("H");
        	result = Integer.parseInt(ft.format(dNow));
		}
		else if(p1.equals("min")){
			ft = new SimpleDateFormat ("m");
        	result = Integer.parseInt(ft.format(dNow));
		}
		else if(p1.equals("sec")){
			ft = new SimpleDateFormat ("s");
        	result = Integer.parseInt(ft.format(dNow));
		}
		return result;
	}
	
	public String date (String p1) throws RemoteException, NotBoundException{
		//* obtain a reference to a bootstrap remote object registry */
		Registry registry = LocateRegistry.getRegistry("localhost", 2018);
		
		IDate date = (IDate) registry.lookup("Date");
		
		String result = date.date(p1);
		return result;
	}
}

