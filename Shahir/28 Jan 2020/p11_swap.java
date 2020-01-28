import java.util.Collections;
import java.util.LinkedList;

public class p11_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		Collections.swap(mylist, 0, 2);
		System.out.println("The New linked list after swap: " + mylist);
	}

}
