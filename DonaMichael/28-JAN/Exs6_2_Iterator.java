import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exs6_2_Iterator {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("green");
		mylist.add("blue");
		mylist.add("red");
		mylist.add("white");
		mylist.add("yellow");
		//System.out.println(mylist);
		
		Iterator it1=mylist.iterator();
		System.out.println("Using iterator object......");
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}

	}

}
