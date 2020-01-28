package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e5_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist=new ArrayList<String>();
		mylist.add("Come");
		mylist.add("as");
		mylist.add("you");
		mylist.add("are.");
		System.out.println(mylist);
		Iterator itr=mylist.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.println(obj);
			}
	}

}
