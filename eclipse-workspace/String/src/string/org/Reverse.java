/**
 * 
 */
package string.org;

/**
 * 
 */
public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch;
		String s = "welcome";
		String s1 ="";
		
		for(int i =s.length()-1;i>=0;i--) {
		ch=s.charAt(i);
		s1 = s1+ch;
		}
		System.out.println(s1);
		
		}
	}


