import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		mylist.add("item4");
		mylist.add("item5");
		System.out.println("total size"+mylist.size());
		System.out.println(mylist.contains("item4"));
		System.out.println(mylist);
		System.out.println("removing item3");
		mylist.remove("item3");
		System.out.println(mylist);
		System.out.println(mylist.size());
	}

}
