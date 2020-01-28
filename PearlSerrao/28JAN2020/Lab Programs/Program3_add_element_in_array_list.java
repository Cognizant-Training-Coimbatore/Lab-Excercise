package demo;

import java.util.ArrayList;

public class Program3_add_element_in_array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		System.out.println("Items before adding"+mylist);
		mylist.add(0,"Item0");
		System.out.println("Items after adding"+mylist);
	}

}
