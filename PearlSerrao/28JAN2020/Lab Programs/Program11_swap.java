package demo;

import java.util.Collections;
import java.util.LinkedList;

public class Program11_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>  mylist=new LinkedList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("The list:"+mylist);
		Collections.swap(mylist, 0, 4);
	    System.out.println("The New linked list after swap: " + mylist);
	}

}
