import java.rmi.*;

public interface Square extends Remote{

	public int getSquare(int num)throws RemoteException;
}
