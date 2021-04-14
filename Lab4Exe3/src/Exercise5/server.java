package Exercise5;

import java.io.IOException;
	import java.io.PrintStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.util.Scanner;

import com.sun.java.accessibility.util.Translator;

	public class server 
	{
		private static final String String = null;

		public static void main(String args[]) throws IOException
		{
			String words, translated;
			
			ServerSocket s1=new ServerSocket(8571);
			Socket exe3=s1.accept();
			Scanner sc=new Scanner(exe3.getInputStream());
			
			Translator message = new Translator();
			
			words=sc.nextLine();
			
			
			
			
			translated = "Selamat Pagi"; 
			 
			 PrintStream p=new PrintStream(exe3.getOutputStream());
			 p.println(translated);		 
			 }	


			
			

		
		}
