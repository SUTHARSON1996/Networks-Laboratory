import java.net.*;
import java.io.*;
import java.util.*;

public class Ping{

	public static void main(String[] args)throws Throwable{
		Scanner s = new Scanner(System.in);
		String input;		

		System.out.println("enter a hostname : ");
		input = s.nextLine();
		InetAddress address = InetAddress.getByName(input);		
		long t1=System.currentTimeMillis();
		if(address.isReachable(10000)){
			long t2=System.currentTimeMillis();
			System.out.println("Host is reachable and time is "+(t2-t1));
		}
		else{
			System.out.println("Host is unreacheable");
		}

	}


}
