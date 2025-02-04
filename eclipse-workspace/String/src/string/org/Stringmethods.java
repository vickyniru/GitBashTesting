package string.org;

import java.util.Arrays;

public class Stringmethods {
	public static void meth() {
		String s1 ="AIRight Technology" ;
		String s2 ="SeleniumAutomation Tool";
		String s3 = "raaghul";
		String s4 = "j a v a p r o g r a m ";
		String s5 = "154365247";
		int len = s1.length();
		System.out.println(len);
		//int len1 = s2.length();
		//System.out.println(len1);
		int len2 = s3.length();
		System.out.println(len2);
		int len3 = s4.length();
		System.out.println(len3);
		int len4 = s5.length();
		System.out.println(len4);
	}
	public void ind() {
		String s1 ="AIRight Technology" ;
		String s2 ="SeleniumAutomation Tool";
		String s3 = "raaghul";
		String s4 = "j a v a p r o g r a m ";
		String s5 = "1543652478";
		int i = s1.lastIndexOf("o");
		System.out.println("The last index of o is" + " " + i);
		int m = s2.indexOf("o");
		System.out.println("The  index of o is" + " " + m);
		int r = s3.indexOf("u");
		System.out.println("The  index of u is" + " " + r);
		int p = s4.indexOf(" ");
		System.out.println("The  index of empty space  is" + "  " + p);
		int l = s5.indexOf("8");
		System.out.println("The  index of 8 is" + " " + l);
		
		
	}
	public void aksh() {
		String s1 ="AIRight Technology" ;
		String s2 ="SeleniumAutomation Tool";
		String s3 = "raaghul";
		String s4 = "j a v a p r o g r a m ";
		String s5 = "1543652478";
		char i = s1.charAt(5);
		System.out.println(i);
		char ch = s2.charAt(11);
		System.out.println(ch);
		char h = s3.charAt(5);
		System.out.println(h);
		char th = s4.charAt(8);
		System.out.println(th);
		char sh = s5.charAt(8);
		System.out.println(sh);
	}
	public void mir() {
		String s1 = "java basics";
		String s2 = "java basics";
		int m = s1.compareTo(s2);
		System.out.println(m);
		int m1 = s1.compareTo(s2);
		System.out.println(m1);
		boolean m2 = s2.equals("Javabasics");
		System.out.println(m2);
		boolean m3 = s2.equalsIgnoreCase("Java basics");
		System.out.println(m3);
	}
	public void nir() {
		int[] arr = {3,1,6,2,9};
		int[] arr1 = {3,1,6,2,9};
		for(int i:arr) {
			System.out.println(i);
		}
		//Arrays.sort(arr);
		//System.out.println("After sorting");
		
		//for(int i:arr) {
			//System.out.println(i);
		//}
		System.out.println( Arrays.equals(arr, arr1));
		String[] names = {"niranj, Akshu, Mirudhu, Vignesh"};
		for(String s:names) {
			System.out.println(s);
		}
		Arrays.sort(names);
		
		System.out.println("After sorting");
		
		for(String s:names) {
			System.out.println(s);
		}
			
	}
	
	public static void main(String[]args) {
		Stringmethods str=new Stringmethods();
		//str.ind(); 
          //meth();
		//str.aksh();
         // String s2 ="SeleniumAutomation Tool";
          //int len1 = s2.length();
  		//System.out.println(len1);
		//str.mir();
		str.nir();
		
	}
}

