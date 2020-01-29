package packc;

import java.util.ArrayList;
import java.util.List;

public class prog_32_arraylist {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("Item1");
		mylist.add("Item2");
		mylist.add("Item3");
		mylist.add("Item4");
		mylist.add("Item5");
		System.out.println("total items"+mylist.size());
		System.out.println("testing item4 exists"+mylist.contains("Item4"));
	System.out.println("printing all items "+mylist);
	System.out.println("removing item 3");
	mylist.remove("Item3");
	System.out.println("printing all items after removing"+mylist);
	System.out.println("total items after removing "+mylist.size());
	}

}
