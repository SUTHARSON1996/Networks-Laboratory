import java.net.*;
import java.io.*;
import java.util.*;

public class Client{

	public static void main(String[] args)throws Throwable{
		Socket soc = new Socket("localhost",5000);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		FileWriter writer = new FileWriter("output.txt");
		String temp = buffer.readLine();		
		while(temp!=null){
			writer.write(temp+"\n");
			temp = buffer.readLine();
		}
		writer.close();
		buffer.close();
		soc.close();

	}


}
