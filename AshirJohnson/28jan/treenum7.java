package helloworld;

import java.util.Iterator;
import java.util.TreeSet;

public class treenum7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myset=new TreeSet<Integer>();
		myset.add(5);
		myset.add(10);
		myset.add(2);
		myset.add(4);
		myset.add(15);
		myset.add(14);
		myset.add(6);
		System.out.println(myset);
		for(int x:myset)
		{
			if(x<7)
			{
				System.out.println(x);
			}
		}
		
	}

}