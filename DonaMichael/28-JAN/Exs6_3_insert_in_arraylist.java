import java.util.ArrayList;
import java.util.List;

public class Exs6_3_insert_in_arraylist {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("Red");
		mylist.add("Green");
		mylist.add("Orange");
		mylist.add("White");
		mylist.add("Black");
		
		System.out.println(mylist);
		  
		  mylist.add(0, "Pink");
		  mylist.add(5, "Yellow");
		  
		  System.out.println("After inserting a new element\n"+mylist);
	}

}
