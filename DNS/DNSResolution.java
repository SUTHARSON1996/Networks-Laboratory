import java.net.*;
import java.io.*;
import java.util.*;

public class DNSResolution{

	public static void main(String[] args)throws Throwable{
		String hostname="",temp="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a hostname to resolve IP : ");
		hostname = scanner.nextLine();
		
		Process p = Runtime.getRuntime().exec("nslookup "+hostname);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		temp = buffer.readLine();	
		while(!temp.contains("Name:")){
			temp = buffer.readLine();	
		}
		
		temp = buffer.readLine();//to read the corresponding address	
		System.out.println(temp);
	}
}
