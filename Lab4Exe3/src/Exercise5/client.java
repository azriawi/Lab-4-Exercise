package Exercise5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String args[]) throws UnknownHostException, IOException
	{
		//define variable
		
		String text, translate;
		
		//create object, syntax for input
		Scanner sc= new Scanner(System.in);
		
		Socket s = new Socket("127.0.0.1",8571);
		Scanner sc1= new Scanner(s.getInputStream());
		
		//output
		System.out.println("Enter Language In English: ");
		
		//input syntax
		text=sc.nextLine();
		
		PrintStream p= new PrintStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		p.println(text);
		
		translate=sc1.next();
		System.out.print("Translated: ");
		System.out.println(translate);
	}
}

