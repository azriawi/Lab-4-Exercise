package Exe5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class ClientSide {

	public static void main(String[] args) {
					
		try {
			
			//Connect to the server at localhost for port 4646
			Socket socket = new Socket(InetAddress.getLocalHost(),4646);
			
			//Create input object
			Scanner sc = new Scanner(System.in);
			
			//create output stream, utk send ke server
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			
			//Display
			System.out.println("----------------------------------------------");
			System.out.println("\t     Client Side");
			System.out.println("----------------------------------------------");
			System.out.println(" ");
			
			//Input From User
			System.out.print("Enter Words In English: ");
			String text =(sc.nextLine());
			
			//send data to server, send text yg client tulis
			outputStream.writeUTF(text);
			outputStream.flush();
		
			//create input stream, utk baca dari server
			DataInputStream dataIn = new DataInputStream(socket.getInputStream());
			
			//assign object to read data from server
			String translatedText = dataIn.readUTF();
		
			System.out.println("\nTranslated text: " );
			System.out.println("\nMalay               Arabic         Korean");
			//print translated text sent from server
			System.out.println(translatedText);
 			
			//Close everything
			outputStream.close();
			sc.close();
			socket.close();
			dataIn.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}