import java.util.ArrayList;
import java.util.List;

public class qn06_array_size_increase {

	public static void main(String[] args) 
	{
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("Bill");
		mylist.add("Tesla");
		mylist.add("Newton");
		mylist.add("Elon");
		System.out.println("Total items "+mylist.size());
		mylist.ensureCapacity(7);
		mylist.add("Stephan");
		mylist.add("Steve");
		mylist.add("Jack");
		System.out.println("Total items "+mylist.size());


	}

}
