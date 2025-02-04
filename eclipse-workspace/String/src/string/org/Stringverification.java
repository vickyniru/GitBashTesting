package string.org;

public class Stringverification {
	public static void ver() {
		String s1="vickyniru@gmail.com";
		String s2= "1g Schürmatstrasse 8913 Ottenbach";
		char c = 'p';
		char pincode = '8';
		int index = s1.indexOf(c);
		System.out.println(index);
		int index1 = s2.indexOf(pincode);
		System.out.println(index1);
		if(index!=-1) {
			System.out.println("The given character is present in the string");
		}
		
			else 
			System.out.println("The given character is not present in the string");
			
		
	 
		
	
	if(index1!=-1) {
	
		System.out.println("The pincode is  present in the string");
	}
		else {
			System.out.println("The pincode is not  present in the string");
		}
	
	}
	
		
			
		
		
	
	
	public static void main(String[]args) {
		ver();
		
	}
}
