import java.net.*;
import java.io.*;
import java.util.*;

public class Client{

	public static void main(String[] args)throws Throwable{
		//String temp="";		
		DatagramSocket dSocket = new DatagramSocket(2900);
		byte[] arr = new byte[100];
		FileWriter writer = new FileWriter("output.txt");
		while(true){
			DatagramPacket pac = new DatagramPacket(arr,arr.length);
			dSocket.receive(pac);			
			byte[] temp = pac.getData();
			System.out.println(new String(temp));
			if(new String(temp)!=""){
				writer.write(new String(temp).trim());			
				writer.flush();
			}else{
				break;
			}			
		}
	}
}
