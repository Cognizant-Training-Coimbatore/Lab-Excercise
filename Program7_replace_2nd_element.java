package demo;

import java.util.ArrayList;

public class Program7_replace_2nd_element {
	public static void main(String[] args) {
	ArrayList <String>  mylist=new ArrayList<String>(4);
	mylist.add("Item1");
	mylist.add("Item2");
	mylist.add("Item3");
	mylist.add("Item4");
	mylist.add("Item5");
	System.out.println("Items before adding"+mylist);
	mylist.set(1,"Item 0");
	System.out.println("Second element after replacing"+mylist);
}
}