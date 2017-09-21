import java.net.*;
import java.io.*;
import java.util.*;

public class Server{

	public static void main(String[] args)throws Throwable{
		ServerSocket server = new ServerSocket(3000);		
		Socket soc = server.accept();
		BufferedReader buffer = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		PrintStream ps = new PrintStream(soc.getOutputStream());
		Scanner s = new Scanner(System.in);		
		String input="", output="";
		System.out.println("Server ready!!!");
		while(!input.equals("bye")){
			input = buffer.readLine();
			System.out.println("Client's message = "+input);
			System.out.print("Server's messsage = ");
			output = s.nextLine();
			ps.println(output);
		}				
		ps.close();
		buffer.close();
		soc.close();
		server.close();
	}
}
