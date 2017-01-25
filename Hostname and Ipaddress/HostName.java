import java.net.*;
import java.util.*;

class HostName{
	public static void main(String[] args)throws Throwable{
		InetAddress address = InetAddress.getLocalHost();
		String hostname,ipaddress,input;
		Scanner s = new Scanner(System.in);
		
		hostname = address.getHostName();
		ipaddress = address.getHostAddress();
		System.out.println("hostname = "+hostname+", ipaddress  = "+ipaddress);
	
		input = s.nextLine();

		address = InetAddress.getByName(input);
		hostname = address.getHostName();
		ipaddress = address.getHostAddress();
		System.out.println("hostname = "+hostname+", ipaddress  = "+ipaddress);


	}
}
