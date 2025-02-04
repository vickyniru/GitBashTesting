package string.org;

public class Phonenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		rep();
		  String s1="987563728134";
		  int p = s1.length();
		  if (p>10) {
			  System.out.println("The phone number is not a valid number");
		  }
		  else
			  System.out.println("The phone number is a valid number");
		  
		  
	}
	public static void rep() {
		String s2= "Welcome to java class";
		String s3 = s2.replaceAll("Welcome to java class","Welcome to SQL class");
		System.out.println(s3);
		String s4= s2.replace('j', 'J');
		System.out.println(s4);
		String s5 = s2.replace("java", "python");
		System.out.println(s5);
		String s6 = s2.replaceAll(" ", "*");
		System.out.println(s6);
		String s7="vickyniru@gmail.com";
		String s8= "gmail";
		String s10 = "Schürmatstrasse 1g,Ottenbach,Zipcode-8913";
		String s11 = "Zipcode-8913";
		
		if(s10.contains(s11)) {
			String s12=s10.replace("Zipcode-8913", " ");
			System.out.println(s12);
		}
	
		if(s7.contains(s8)) {
			String s9=s7.replace("gmail", "yahoo");
			System.out.println(s9);
		}
			else {
				System.out.println(s7);
			}
		}
	}


