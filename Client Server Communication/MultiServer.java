import java.util.*;
import java.io.*;
import java.net.*;


public class MultiServer{
	public static int count=0;

	public static void main(String[] args)throws Throwable{
		ServerSocket server = new ServerSocket(3000);
		while(true){
			Socket soc = server.accept();
			multi m = new multi(soc);
			m.start();
		}
		server.close();
	}


}

class multi extends Thread{


	private Socket soc=null;
	public multi(Socket soc){
		try{
			this.soc = soc;
			//BufferedReader buffer = new BufferedReader(new InputStreamReader(this.soc.getInputStream()));
			//String input = buffer.readLine();
			//System.out.println("Client's message = "+input);
			MultiServer.count++;
		}catch(Exception e){
		
		}
	}
	public void run(){
		try{
			BufferedReader buffer= new BufferedReader(new InputStreamReader(this.soc.getInputStream()));
			String input = buffer.readLine().toString();
			System.out.println("Client's message = "+input);
			buffer.close();
			soc.close();	

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}

