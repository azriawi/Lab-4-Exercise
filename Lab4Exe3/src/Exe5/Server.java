package Exe5;




	import java.io.BufferedReader;
	import java.io.DataInputStream;
	import java.io.DataOutputStream;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.ServerSocket;
	import java.net.Socket;

	public class Server { 

		
		public static void main(String[] args) throws Exception {
			
			
			//ServerSocket serverSocket = null;
			
		
					    
				
				//Bind Serversocket to a port
				//int portNo = 4228;
			//	serverSocket = new ServerSocket(portNo);
				ServerSocket s1=new ServerSocket(4228);
				
			
				
				System.out.println("Server Side");
				System.out.println("Waiting for request...");
				
				
				
					
					//Accept client request for connection
					Socket clientSocket = s1.accept();
					
					//Create stream to read data from client
					DataInputStream dataIn = new DataInputStream(clientSocket.getInputStream());
					
					//create new object for translator
					Translator message = new Translator();
					
					//assign text read from client
					 message.setText(dataIn.readUTF()); 
					 
					//assign language read from client 
					// message.setLanguage(dataIn.readInt()); 
					 
					 //Object to store text
					 String text = message.getText();
					 
					 //Object to store language
					 //int language= message.getLanguage();
					 
					 //Translate the text 
					Translator textToTranslate = new Translator(text);
					
					//Create stream to write data to the network
					DataOutputStream dataOut = new DataOutputStream(clientSocket.getOutputStream());
					
					//Send data to the client
					dataOut.writeUTF(textToTranslate.getTranslatedText());
					dataOut.flush();
									
					//close the socket
					s1.close();
					
					dataIn.close();
					dataOut.close();
						 
					clientSocket.close();
				
				
				
				
			

		}

	}


