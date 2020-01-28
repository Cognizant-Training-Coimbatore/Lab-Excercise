package demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Program9_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>  mylist=new ArrayList<String>(4);
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("Items before adding"+mylist);
		
		
		Iterator p = mylist.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
	}
	}
}
