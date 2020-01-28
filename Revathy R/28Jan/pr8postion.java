package prgrms;

import java.util.ArrayList;
import java.util.List;

public class pr8postion {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i).toString());
		}
	}

}
