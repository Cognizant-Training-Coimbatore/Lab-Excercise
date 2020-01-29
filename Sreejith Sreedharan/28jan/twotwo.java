package packc;

import java.util.TreeSet;

public class twotwo {

	public static void main(String[] args) {
		TreeSet<String> myset=new TreeSet<String>();
		TreeSet<String> myset1=new TreeSet<String>();
		myset.add("blue");
		myset.add("green");
		myset.add("yellow");
		myset.add("pink");
		myset.add("white");
		System.out.println("first tree set "+myset);
		myset1.add("black");
		myset1.add("white");
		System.out.println("second tree set "+myset1);
		myset1.addAll(myset);
		System.out.println("new second set after adding elements of first set "+myset1);
	}

}
