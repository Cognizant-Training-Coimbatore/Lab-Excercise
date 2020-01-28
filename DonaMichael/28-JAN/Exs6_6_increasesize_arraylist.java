import java.util.ArrayList;
import java.util.List;


public class Exs6_6_increasesize_arraylist {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("Red");
		mylist.add("Green");
		mylist.add("Orange");
		mylist.add("White");
		mylist.add("Black");
		System.out.println(mylist);
		
		((ArrayList<String>) mylist).ensureCapacity(7);
		mylist.add("pink");
		mylist.add("Blue");
		System.out.println(mylist);

	}

}
