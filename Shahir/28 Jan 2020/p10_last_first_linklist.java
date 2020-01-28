import java.util.LinkedList;

public class p10_last_first_linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		System.out.println("First element: "+mylist.getFirst());
		System.out.println("Last element: "+mylist.getLast());
	}

}
