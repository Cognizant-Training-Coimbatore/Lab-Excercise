package prgrms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pr4retrieve {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		System.out.println("printing all colors "+mylist);
		System.out.println("enter the specified position from 0 to 4");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("element at "+i+" is "+mylist.get(i).toString());

	}

}
