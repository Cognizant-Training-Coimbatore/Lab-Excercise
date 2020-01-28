package prgrms;

import java.util.TreeSet;

public class pr15strictly {

	public static void main(String[] args) {
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(5);
		myset.add(8);
		myset.add(4);
		myset.add(9);
		System.out.println(myset);
		System.out.println("elements strictly greater than or equall to 8"); 
		System.out.println(myset.ceiling(8));
		

	}

}
