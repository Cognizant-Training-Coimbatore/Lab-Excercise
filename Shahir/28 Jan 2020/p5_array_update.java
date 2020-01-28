import java.util.ArrayList;
import java.util.List;

public class p5_array_update
{
	public static void main(String[] args)
	{
		List<String> mylist = new ArrayList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		mylist.set(0, "Orange");
		System.out.println("Printing all items: "+mylist);
	}

}
