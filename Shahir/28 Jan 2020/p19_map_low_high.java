import java.util.TreeMap;

public class p19_map_low_high
{
	public static void main(String[] args)
	{
		 TreeMap < Integer, String > tm1 = new TreeMap < Integer, String > ();
		 tm1.put(10, "Hi");
		 tm1.put(20, "Hey");
		 tm1.put(40, "Hola");
		 tm1.put(50, "Hello");
		
		System.out.println("Orginal TreeMap content: " + tm1);
		System.out.println("Lowest key: " + tm1.firstKey());
		System.out.println("Greatest key: " + tm1.lastKey());
	}

}
