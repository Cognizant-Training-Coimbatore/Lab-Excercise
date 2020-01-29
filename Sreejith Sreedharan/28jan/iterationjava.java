package packc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterationjava {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("RED");
		mylist.add("ORANGE");
		mylist.add("GREEN");
		mylist.add("YELLOW");
		mylist.add("BLUE");
	System.out.println("printing all items "+mylist);
	Iterator it1=mylist.iterator();
	System.out.println("using iterator object....");
	while(it1.hasNext())
	{
		Object obj=it1.next();
		System.out.println(obj);
	}
	}

}