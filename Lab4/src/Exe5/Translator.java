package Exe5;

public class Translator {

	private String text;

	public Translator(String text) {
		
		this.text=text;
		//this.language=language;
		
		
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
			
		
				translatedText="Selamat Pagi          الخير          좋은 아침";
	
			}
			
			
		else if (text.contentEquals("Good Night")||text.contentEquals("Good night")||text.contentEquals("good night")) {
			
		
				translatedText="Selamat malam     مساء الخير        안녕히 주무세요";
				
						
			}
			
		else if (text.contentEquals("How are you?")||text.contentEquals("how are you?")) {
			
			
				translatedText="Apa khabar?         كيف حالكم؟          어떻게 지내세요?";
				
		
			}
		
	    else if (text.contentEquals("Thank you")||text.contentEquals("thank you")) {
		
				translatedText="Terima kasih       شكرا جزيلا       감사합니다";
		
			}
		
		else if (text.contentEquals("Goodbye")||text.contentEquals("goodbye")) {
			
		
				translatedText="Selamat Tinggal    مع السلامة           안녕";
				
		
			}
			
		else if (text.contentEquals("What's up?")||text.contentEquals("what's up?")) {
			
			
				translatedText="Ada apa?             ما أخبارك؟      뭐야?";
						
			}
		
		
		return translatedText;
	
	  }

}
