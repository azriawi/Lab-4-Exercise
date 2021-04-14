package Exe3Method2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

	public class Server {
		private static final String String = null;

		public static void main(String args[]) throws IOException
		{
			String words;
			int count=0;
			ServerSocket s1=new ServerSocket(4646);
			Socket exe3=s1.accept();
			Scanner sc=new Scanner(exe3.getInputStream());
			
			words=sc.nextLine();
			
			//call method 
			count=countWord(words); 
			 
			 PrintStream p=new PrintStream(exe3.getOutputStream());
			 p.println(count);		 
			 }	


	public static int countWord(String words)
	{

	    if(words.isBlank()) 
	    {
	        return 0;
	    }
	    
	    int count = 0;
	    
	    for(int index = 0;index<words.length() -1 ;index++) 
	    {
	        if(words.charAt(index) == ' ' && words.charAt(index +1) != ' ')
	        {
	            count += 1;
	        }
	    }
	    return count + 1;
	}
}