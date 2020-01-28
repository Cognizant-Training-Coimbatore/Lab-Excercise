package helloworld;

import java.util.HashSet;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myset =new HashSet<String>();
		Set<String> myset1 =new HashSet<String>();
		myset.add("one");
		myset.add("two");
		myset.add("three");
		myset.add("four");
		myset1.add("two");
		myset1.add("five");
		myset1.add("six");
		myset1.add("three");
		myset.retainAll(myset1);
		System.out.println(myset);
	}

}
