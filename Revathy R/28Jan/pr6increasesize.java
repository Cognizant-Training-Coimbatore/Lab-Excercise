package prgrms;

import java.util.ArrayList;
import java.util.List;

public class pr6increasesize {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		System.out.println("printing all colors "+mylist);
		((ArrayList<String>) mylist).ensureCapacity(400); 
		System.out.println("ArrayList can now surely store upto 400 elements.");
	}

}
