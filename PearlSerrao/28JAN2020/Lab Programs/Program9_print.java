package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Program9_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>  mylist=new LinkedList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("Items "+mylist);
		
		
		Iterator p = mylist.listIterator(1);

		   // print list from second position
		   while (p.hasNext()) {
		   System.out.println(p.next());
	}
	}
}
