import java.util.TreeMap;
public class p18_key_value
{
	public static void main(String[] args)
	{
		 TreeMap < Integer, String > tm1 = new TreeMap < Integer, String > ();
		 tm1.put(10, "Hi");
		 tm1.put(20, "Hey");
		 tm1.put(40, "Hola");
		 tm1.put(50, "Hello");
		 System.out.println("Orginal TreeMap content: " + tm1);
		 System.out.println("Checking the entry for 10: ");
		 System.out.println("Value is: " + tm1.floorEntry(10));
		 System.out.println("Checking the entry for 30: ");
		 System.out.println("Value is: " + tm1.floorEntry(30));
		 System.out.println("Checking the entry for 70: ");
		 System.out.println("Value is: " + tm1.floorEntry(70));
	}
}