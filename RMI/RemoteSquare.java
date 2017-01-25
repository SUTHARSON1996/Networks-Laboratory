import java.rmi.*;
import java.rmi.server.*;

public class RemoteSquare extends UnicastRemoteObject implements Square{


	public RemoteSquare() throws RemoteException{

		super();
	}

	public int getSquare(int num){
		return num*num;
	}


}
