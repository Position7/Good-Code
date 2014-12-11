package chap01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.Socket;


public class Client {

	public static void main(String[] args) {
		
		try{
			Socket s = new Socket("200.1.4.204", 10000);
			DataOutputStream Dos = new DataOutputStream(s.getOutputStream());
			Dos.writeUTF("잘지내니?");
			DataInputStream Dis = new DataInputStream(s.getInputStream());
			System.out.println(Dis.readUTF());
			s.close();
		
		}catch(UnknownHostException e) {
			
		}catch(IOException e){
					
		}

	}

}
