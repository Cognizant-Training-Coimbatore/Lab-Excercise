package demo;

import java.util.TreeSet;

public class Program13_add_all_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("X");
		myset.add("F");
		myset.add("T");
		myset.add("9");
		myset.add("X");
		
		System.out.println("Set 1 is"+myset);
		
		TreeSet<String> myset2=new TreeSet<String>();
		myset2.add("X");
		myset2.add("8");
		myset2.add("I");
		myset2.add("Q");
		myset2.add("T");
		
		System.out.println("Set 2 is"+myset2);
		
		myset.addAll(myset2);
		
		System.out.println("Set 1 after adding set 2: "+myset);
		
	}

}
