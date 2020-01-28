import java.util.ArrayList;
import java.util.List;

public class p8_array_printall {

	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		 int no_of_elements = mylist.size();
		for (int index = 0; index < no_of_elements; index++)
		System.out.println("Items: "+mylist.get(index));
	}

}
