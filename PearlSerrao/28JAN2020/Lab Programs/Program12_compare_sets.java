package demo;

import java.util.HashSet;
import java.util.LList;

public class Program12_compare_sets {

	public static void main(String[] args) {
	HashSet<String>  mylist=new HashSet<String>();
	mylist.add("Item1");
	mylist.add("Item2");
	mylist.add("Item3");
	mylist.add("Item4");
	mylist.add("Item5");
	System.out.println("The hashset 1:"+mylist);
	
	HashSet<String>  mylist2=new HashSet<String>();
	mylist2.add("Item1");
	mylist2.add("Item2");
	mylist2.add("Item3");
	mylist2.add("Item4");
	mylist2.add("Item5");
	System.out.println("The hashset 2:"+mylist2);
	mylist.retainAll(mylist2);
    System.out.println("HashSet is:");
    System.out.println(mylist);
}
}
