package javapractise;

public class Exam3_character {
	
	
	public static void main(String[] args) {
		
		
		
	String st= "i love java & selenium pp";
	
	System.out.println(st.length());
	
	st=st.replaceAll("\\s", "");
	
	System.out.println(st.length());
	
	System.out.println(st);
	
	char[] chars=st.toCharArray();
	
	int vowel=0;
	int consonant=0;
	for(int i=0; i<chars.length;i++) {
		
		
		if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u') {
			
			vowel++;
			
		}
		else {
			consonant++;
		}
		
	}
	
	
		System.out.println(vowel);
	
		System.out.println(consonant);
		}
		
		
		
		
	

}
