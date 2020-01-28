package demo;

import java.util.ArrayList;

public class Program8_print_all_elements_with_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String>  mylist=new ArrayList<String>(4);
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("Item"+mylist);
	
		System.out.println("Print using index of an element: ");
		//  int no_of_elements =list.size();
		  for (int i= 0; i <mylist.size(); i++) 
		   System.out.println(mylist.get(i));
		  
		/*
		 * for(String s:mylist) Sy		 *///stem.out.println(s+mylist.indexOf(mylist));
}
}