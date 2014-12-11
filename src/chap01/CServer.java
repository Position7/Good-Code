package chap01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CServer{
	
	public static void main(String[] args) {
		Thread a = new a();
		a.start();

	}
}
class a extends Thread{

	ServerSocket ss ;
	
	public void run() {
		
			try {
				while(true) {
				ss = new ServerSocket(10000);	
				Socket sc = ss.accept();
				DataInputStream Dis = new DataInputStream(sc.getInputStream());
				System.out.println(Dis.readUTF());
				DataOutputStream Dos = new DataOutputStream(sc.getOutputStream());
				Dos.writeUTF("¤»¤»");
				sc.close();
				}
			}catch (Exception e) {
				
		}
	}
}
