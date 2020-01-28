package demo;

import java.util.ArrayList;

public class Program2_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List <String>  mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		mylist.add("Item6");
		mylist.add("Item7");
		for(String s:mylist);
		System.out.println("Items are:"+mylist);
	}

}
