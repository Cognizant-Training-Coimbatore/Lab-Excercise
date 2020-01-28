package prgrms;

import java.util.Iterator;
import java.util.TreeSet;

public class pr14lessthan7 {

	public static void main(String[] args) {
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(1);
		myset.add(5);
		myset.add(8);
		myset.add(4);
		myset.add(9);
		System.out.println(myset);
		System.out.println("elements lower than 7 in the tree set are "); 
		for(int x:myset)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}
		

	}

}
