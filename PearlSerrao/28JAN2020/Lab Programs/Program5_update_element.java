package demo;

import java.util.ArrayList;

public class Program5_update_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		System.out.println("Items before adding"+mylist);
		mylist.set(0,"Item 0");
		System.out.println("Items after replacing"+mylist);
	}

}
