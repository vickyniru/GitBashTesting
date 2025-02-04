package string.org;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1="Welcome to Java Class";
     String[] sp =s1.split("to");
     for (String s2 : sp) {
			System.out.println(s2);
	}
     String[] spf =s1.split("J");
     for (String s3 : spf) {
			System.out.println(s3);
	}
    String[] r=s1.split("");
    for (String p :r) {
    	System.out.println(p);
    }
}
}