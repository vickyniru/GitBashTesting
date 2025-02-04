package string.org;

public class Upperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="niranjana";
		String s2= "NIRANJANA";
		String s3= s1.toUpperCase();
		System.out.println(s3);
		String s4 = s2.toLowerCase();
		System.out.println(s4);
		String s5 = "WeLcOMe To JavA CLass";
		int count=0;
		int countlow=0;
		char c='Z';
		char d='n';
		
		for (int i=0;i<s5.length();i++) {
			c= s5.charAt(i);
			if(Character.isUpperCase(c)) {
				count++;
				}
			else if(Character.isLowerCase(d)) {
				countlow++;
			}
		}  
System.out.println("Upper case count" + " = " + count);
System.out.println("Lower case count" + " = " + countlow);
	
	}
}
