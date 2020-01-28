package prgrms;

import java.util.HashSet;
import java.util.Set;

public class pr12compareset {

	public static void main(String[] args) {
		Set<String> myset1=new HashSet<String>();
		Set<String> myset2=new HashSet<String>();
		myset1.add("one");
		myset1.add("two");
		myset1.add("three");
		myset1.add("one");
		System.out.println("elemets in first set are "+myset1);
		myset2.add("three");
		myset2.add("nine");
		myset2.add("four");
		myset2.add("one");
		System.out.println("elements in second set are "+myset2);
		myset1.retainAll(myset2);
		System.out.println("elements same on both sets are "+myset1);

	}

}
