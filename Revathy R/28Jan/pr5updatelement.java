package prgrms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pr5updatelement {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("blue");
		mylist.add("green");
		mylist.add("yellow");
		mylist.add("pink");
		mylist.add("white");
		System.out.println("printing all colors "+mylist);
		System.out.println("enter the string to be replaced");
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int i =mylist.indexOf(st); 
		System.out.println("enter the string with which it is replaced");
		String s=sc.next();
		mylist.set(i,s);
		System.out.println("replaced list "+mylist);

	}

}
