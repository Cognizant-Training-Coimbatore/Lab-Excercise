import java.util.TreeMap;

public class p20_map_position
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
		  System.out.println("Key(s): " + tm1.headMap(10, true));
		  System.out.println("Checking the entry for 20: ");
		  System.out.println("Key(s): " + tm1.headMap(20, true));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key(s): " + tm1.headMap(70, true));
	}
}