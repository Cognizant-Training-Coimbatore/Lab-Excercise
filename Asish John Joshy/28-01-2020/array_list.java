package demo;

import java.util.ArrayList;
import java.util.List;

public class array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		{
			mylist.add("3");
			mylist.add("Item2");
			mylist.add("Item3");
			mylist.add("Item4");
			mylist.add("Item5");
			System.out.println("Total items "+mylist.size());
			System.out.println("Testing item 4 exists "+mylist.contains("Item4"));
			System.out.println("Printing all items "+mylist);
			System.out.println("Removing item 3");
			mylist.remove("Item3");
			System.out.println("Printing all remaining items"+mylist);
			System.out.println("Total remaining items "+mylist.size());
		}
	}

}
