package prgrms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pr2iterate {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		Iterator it1=mylist.iterator();
		System.out.println("using iterator object...");
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}

	}

}
