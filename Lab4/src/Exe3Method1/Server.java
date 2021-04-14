package Exe3Method1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
	
public class Server 
	{
		private static final String String = null;

		public static void main(String args[]) throws IOException
			{
				String words;
				int count=0;
				ServerSocket s1=new ServerSocket(4646);
				
				//accept client request
				Socket exe3=s1.accept();
							
				//create input stream, utk baca dari client
				DataInputStream dataIn = new DataInputStream(exe3.getInputStream());
				
		
				//read data from client, pakai readUTF sebab String
				words=dataIn.readUTF();
				
				//call method 
				count=countWord(words); 
				
				//Create output stream to send back to client
				DataOutputStream dataOut = new DataOutputStream(exe3.getOutputStream());
				
				//send data kt client, pakai writeInt sebab integer
				dataOut.writeInt(count);
				dataOut.flush();
				
				//Close everything
				s1.close();
				exe3.close();
				dataIn.close();
				dataOut.close();
					 
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


