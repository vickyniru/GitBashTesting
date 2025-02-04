package string.org;

public class Stringlearnings {
	int price;
	public static void main(String[] args) {
		
		Stringlearnings s = new Stringlearnings();
		s.price=500;
		Stringlearnings s1 = new Stringlearnings();
		s1.price=500;
		System.out.println("Hashcode of s"+ ";" + s);
		System.out.println(s.hashCode());
		System.out.println("Hashcode of s1"+ ";" + s1);
		System.out.println(s1.hashCode());
	if(s.equals(s1))
	{
		System.out.println("both objects are equal");
	}
		else 
		{
			System.out.println("both objects are not equal");
		}
	}
	public boolean equals(Object o)
	{
		Stringlearnings s2 = (Stringlearnings)o;
		if(this.price==s2.price)
		return true;
		else
			return false;
	}
	public int hashCode()
	{
		return 456;
	}
   public String toString()
   {
	return "value";   
   }
  
}
