package prgrms;

import java.util.ArrayList;
import java.util.List;

public class pr3firstpos {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		System.out.println("printing all colors "+mylist);
		mylist.add(0,"black");
		System.out.println("printing all colors "+mylist);
	}

}
