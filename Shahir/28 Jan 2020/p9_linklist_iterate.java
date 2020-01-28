import java.util.Iterator;
import java.util.LinkedList;

public class p9_linklist_iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("Black");
		mylist.add("Red");
		mylist.add("White");
		mylist.add("Blue");
		System.out.println("Total items: "+mylist.size());
		System.out.println("Printing all items: "+mylist);
		Iterator it1 = mylist.listIterator(1);
		while(it1.hasNext())
		{
			Object obj = it1.next();
			System.out.println(obj);
		}
	}

}
