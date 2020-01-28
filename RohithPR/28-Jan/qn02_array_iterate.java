import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class qn02_array_iterate {

	public static void main(String[] args) 
	{
		List<String>Array = new ArrayList<String>();
		Array.add("Superman");
		Array.add("Batman");
		Array.add("Flash");
		Array.add("Martian Man Hunter");
		Array.add("Wonder Women");
		Array.add("Aquaman");
		Iterator it2 = Array.iterator();
		while(it2.hasNext())
		{
			Object obj = it2.next();
			System.out.println(obj);
		}
		

	}

}
