package demo;

import java.util.ArrayList;

public class Program4_retrieve_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> list = new ArrayList<String>();
		  list.add("Red");
		  list.add("Green");
		  list.add("Orange");
		  list.add("White");
		  list.add("Black");
		 
		  System.out.println(list);
		
		  String element = list.get(0);
		  System.out.println("First element : "+element);
		
	}

}
