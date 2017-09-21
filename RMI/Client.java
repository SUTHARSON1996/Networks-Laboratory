import java.rmi.*;
import java.util.*;

public class Client{

	public static void main(String[] args)throws Throwable{
		int x, result;
		Scanner s = new Scanner(System.in);
		Square stub = (Square)Naming.lookup("rmi://localhost:4500/square");
		x = s.nextInt();
		result = stub.getSquare(x);
		System.out.println("Square of "+x+" is "+result);
	
	}
}
