package Exe3Method2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

	public class Client {

		public static void main(String args[]) throws UnknownHostException, IOException
		{
			//define variable
			int c;
			String text;
			
			//create object, syntax for input
			Scanner sc= new Scanner(System.in);
			
			Socket s = new Socket("127.0.0.1",4646);
			Scanner sc1= new Scanner(s.getInputStream());
			
			//output
			System.out.println("Enter Any Words: ");
			
			//input syntax
			text=sc.nextLine();
			
			PrintStream p= new PrintStream(s.getOutputStream());
			p.println(text);
			
			c=sc1.nextInt();
			System.out.print("Number of Words: ");
			System.out.println(c);
		}
	}