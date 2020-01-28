import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p2_iterate_arraylist {

	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		Iterator it1 = mylist.iterator();
		while(it1.hasNext())
		{
			Object obj = it1.next();
			System.out.println(obj);
		}
	}

}
