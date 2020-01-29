
import java.util.ArrayList;
import java.util.List;

public class Q5_28JAN_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		mylist.add("are");
		mylist.add("you");
		mylist.add("searching");
		mylist.add("for");
		mylist.add("something");
		System.out.println("Original " +mylist);
		mylist.remove("something?");
		mylist.add("peace?");
		System.out.println("After updating" +mylist);
	}

}
