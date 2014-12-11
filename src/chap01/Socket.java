package chap01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;


public class Socket extends Thread {

	ServerSocket a;
	Socket b;
	public InputStream getInputStream() {
		// TODO Auto-generated method stub
		return null;
	}
				
	}
	
	class Sockets extends Thread{
		public void run() {
			try {
				ServerSocket c = new ServerSocket(2014);
				while(true){
				
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
 
	public static void main(String[] args) {
		
		Thread m = new Thread();
		m.start();
		
	}
}
