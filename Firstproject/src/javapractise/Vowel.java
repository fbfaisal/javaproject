package javapractise;

public class Vowel {

	public static void main(String[] args) {
		
		
		String str="Selenium library send jsonwire protocol to browser driver";
		
		str=str.replaceAll("\\s", "");
		
		System.out.println(str.length());
		
		char[] chars=str.toCharArray();
		
		int vowelcount=0;
		
		for(int i=0; i<chars.length; i++) {
			
			if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' ||chars[i]=='u') {
				
				vowelcount++;
			}
			
		
		}
		
		System.out.println("vowel count="+ vowelcount);	
		
	}

}
