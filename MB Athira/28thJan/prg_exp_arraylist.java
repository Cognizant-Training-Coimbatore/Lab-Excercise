import java.util.ArrayList;
import java.util.List;

public class prg_exp_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<String>();
		mylist.add("Revathy");
		mylist.add("Fakama");
		mylist.add("Athira");
		mylist.add("Della");
		mylist.add("Sreejith");
		mylist.add("Rohit");
		mylist.add("Dona");
		System.out.println("Total items "+mylist.size());
		System.out.println("Testing items exists "+mylist.contains("item4"));
		System.out.println("Printing all items "+mylist);
		mylist.remove("Athira");
		System.out.println("Printing all items after removing "+ mylist);
		System.out.println("Total items after removing "+mylist.size());
	}

}
