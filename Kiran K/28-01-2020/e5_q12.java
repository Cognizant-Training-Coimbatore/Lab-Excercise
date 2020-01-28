package demo;

import java.util.HashSet;
import java.util.Set;

public class e5_q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>myset1 = new HashSet<String>();
		myset1.add("one");
		myset1.add("two");
		myset1.add("three");
		Set<String>myset2 = new HashSet<String>();
		myset2.add("one");
		myset2.add("three");
		myset1.retainAll(myset2);
		System.out.println(myset1);
	}

}
