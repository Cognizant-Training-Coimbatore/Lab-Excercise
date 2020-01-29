package packc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class retrieve {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("RED");
		mylist.add("ORANGE");
		mylist.add("GREEN");
		mylist.add("YELLOW");
		mylist.add("BLUE");
	System.out.println("printing all items "+mylist);
	System.out.println("Enter specific position from 0 to 4");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	System.out.println("element at "+i+mylist.get(i).toString() );
	}

}
