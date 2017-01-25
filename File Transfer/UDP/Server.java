import java.net.*;
import java.util.*;
import java.io.*;

public class Server{
	public static void main(String[] args)throws Throwable{
		byte[] arr = new byte[2048];
		int i=0;
		DatagramSocket dSocket = new DatagramSocket();
		InetAddress address = InetAddress.getLocalHost();
		FileInputStream fis = new FileInputStream("input.txt");
		while(fis.available()!=0){
			arr[i]=(byte)fis.read();
			i++;
		}
		DatagramPacket pac = new DatagramPacket(arr,arr.length,address,2900);
		dSocket.send(pac);
	}
}
