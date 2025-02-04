package string.org;

public class Startsend {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString s1= 
		String s1= "  Welcome to java class";
		String s6 = "to";
		String s7="niranjna";
		String s8= "kalidaas";
		boolean s2 = s1.endsWith("clas");
		System.out.println(s2);
		boolean s3 = s1.startsWith("Welcome");
		System.out.println(s3);
		boolean s4 = s6.isEmpty();
		System.out.println(s6);
		int result=s8.compareTo(s7);
		int result1=s7.compareToIgnoreCase(s8);
		boolean res = s1.startsWith(s6, 8);
		boolean result2 = s7.contentEquals(s8);
		System.out.println(result);
		
		System.out.println(result1);
		System.out.println(res);
		System.out.println("both are equal" +  result2);
		String extract =s1.substring(8);
		System.out.println(extract);
		String extract1 =s1.substring(8,15);
		System.out.println(extract1);
		System.out.println(s1.trim());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.indent(5));
		System.out.print(s7.repeat(5));
	
	}

}
