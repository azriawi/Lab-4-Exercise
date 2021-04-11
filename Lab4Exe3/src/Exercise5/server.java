package Exercise5;

import java.io.IOException;
	import java.io.PrintStream;
	import java.net.ServerSocket;
	import java.net.Socket;
	import java.util.Scanner;

	public class server 
	{
		private static final String String = null;

		public static void main(String args[]) throws IOException
		{
			String words, translated;
			
			ServerSocket s1=new ServerSocket(8571);
			Socket exe3=s1.accept();
			Scanner sc=new Scanner(exe3.getInputStream());
			
			words=sc.nextLine();
			
			//call method 
			translated = Translate(words); 
			 
			 PrintStream p=new PrintStream(exe3.getOutputStream());
			 p.println(translated);		 
			 }	


	
			

			public static String Translate(String text) 
			{
				
				String [][] words = {{"Good morning","Selamat Pagi" },
						{"Good night", "Selamat malam"},
						{"How are you?", "Apa khabar?"},
						{"Thank you","Terima kasih"},
						{"Goodbye","Selamat tinggal"},
						{"What's up?","Ada apa?"}};
				
				String translated = "" ;
				for(int i = 0;i<words.length;i++) {
					if(words[i][0].equalsIgnoreCase(text)) {
						System.out.print("jumpa");
						for(String word: words[i]) {
							
							translated += word+".";
						
						}
						break;
					}
					
				}
				System.out.print("tak jumpa");
				return translated;
			}
		}
