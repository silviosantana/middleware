package DateAndTimeRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateImpl extends UnicastRemoteObject implements IDate{
	
	protected DateImpl() throws RemoteException {
		super();
	}

	private SimpleDateFormat ft;
	
	private static final long serialVersionUID = 1L;
	
	public String date (String p1){
		Date dNow = new Date( );
		String result = "Invalid";

		if(p1.equals("year")){
			ft = new SimpleDateFormat ("yyyy");
        	result = ft.format(dNow);
		}
		else if(p1.equals("mon")){
			ft = new SimpleDateFormat ("M");
			result = ft.format(dNow);
		}
		else if(p1.equals("day")){
			ft = new SimpleDateFormat ("d");
			result = ft.format(dNow);
		}
		return result;
	}

}
