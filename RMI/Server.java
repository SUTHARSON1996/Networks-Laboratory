import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class Server{

	public static void main(String[] args)throws Throwable{
		Square skeleton = new RemoteSquare();
		Naming.rebind("rmi://localhost:4500/square",skeleton);
		System.out.println("Server is ready");		

	}
}
