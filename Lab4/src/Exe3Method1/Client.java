package Exe3Method1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
	

	public class Client {

		public static void main(String args[]) throws UnknownHostException, IOException
		{
			//define variable
			String text;
			
			//create object, syntax for input
			Scanner sc= new Scanner(System.in);
			
			Socket s = new Socket("127.0.0.1",4646);
			
			//create output stream, utk send ke server
			DataOutputStream outputStream = new DataOutputStream(s.getOutputStream());
			
			//output
			System.out.println("Enter Any Words: ");
			
			//input syntax
			text=sc.nextLine();
			
			//send data to server, send text yg client tulis
			outputStream.writeUTF(text);
			outputStream.flush();
			
			//create input stream, utk baca dari server
			DataInputStream dataIn = new DataInputStream(s.getInputStream());
			
			//read from server
			int textword = dataIn.readInt();
			
						
			//kt sini print number of word sent dri server
			System.out.print("Number of Words: ");
			System.out.println(textword);
		}
	}


