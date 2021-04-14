package Exe5;


public class Translator {

	private String text;
	private int language;
	
	
	public Translator(String text) {
		
		this.text=text;
	//	this.language=language;
		
		
	}
	
	public Translator() {
		
		
		
	}
	
	public void setText(String text) {
		
		this.text=text;
		
	}
	
	public String getText() {
		
		return text;
		
	}
	
	
	
	
	
	public String getTranslatedText() {
		
		String translatedText = "";
				
		if(text.contentEquals("Good Morning")||text.contentEquals("Good morning")||text.contentEquals("good morning")) {
			
			
				
				System.out.println("Selamat Pagi" +"صباح الخير" +"좋은 아침");
				
		
				
		}
			
			
		else if (text.contentEquals("Good Night")||text.contentEquals("Good night")||text.contentEquals("good night")) {
			
			System.out.println("Selamat malam");
				
				
			System.out.println("مساء الخير");
				
		
			
			System.out.println("안녕히 주무세요");
				
			}
			
		else if (text.contentEquals("How are you?")||text.contentEquals("how are you?")) {
			
			
				
			System.out.println("Apa khabar?");
				
		
				
			System.out.println("كيف حالكم؟");
				
			
			
			System.out.println("어떻게 지내세요?");
				
			
		
		}
		else if (text.contentEquals("Thank you")||text.contentEquals("thank you")) {
			
			
				
			System.out.println("Terima kasih");
				
		
				
			System.out.println("شكرا جزيلا");
				
			
			
			System.out.println("감사합니다");
				
			}
		
		else if (text.contentEquals("Goodbye")||text.contentEquals("goodbye")) {
			
			
				
			System.out.println("Selamat Tinggal");
				
			
				
			System.out.println("مع السلامة");
		
			
			System.out.println("안녕");
				
			}
			
		else if (text.contentEquals("What's up?")||text.contentEquals("what's up?")) {
			
			
				
			System.out.println("Ada apa?");
				
		
				
			System.out.println("ما أخبارك؟");
				
			
			
			System.out.println("뭐야?");
				
			}
		
		
		
	
		return translatedText;
	
	
	}

	
	
	
	}
