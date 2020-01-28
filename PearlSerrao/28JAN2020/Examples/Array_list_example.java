package demo;

import java.util.ArrayList;

public class Array_list_example {
	
	public static void main(String[] args) {
java.util.List <String>  mylist=new ArrayList<String>();
mylist.add("Item1");
mylist.add("Item2");
mylist.add("Item3");
System.out.println("total items"+mylist.size());
System.out.println("testing item1 exists??"+mylist.contains("item1"));
System.out.println("total items"+mylist.size());
mylist.remove("item3");
System.out.println("Printing all items after removing"+mylist.size());
	}
}
