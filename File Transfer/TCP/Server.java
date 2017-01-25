import java.util.*;
import java.net.*;
import java.io.*;

public class Server{

	public static void main(String[] args)throws Throwable{
		String temp;
		ServerSocket server = new ServerSocket(5000);
		Socket soc = server.accept();
		PrintStream ps = new PrintStream(soc.getOutputStream());
		BufferedReader buffer = new BufferedReader(new FileReader("input.txt"));
		System.out.println("Server ready...");
		while((temp=buffer.readLine())!=null){
			ps.println(temp);		
		}
		ps.close();
		buffer.close();
		soc.close();
		server.close();
	}

}
