package demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_set_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("X");
		myset.add("F");
		myset.add("T");
		myset.add("9");
		myset.add("X");
		
		System.out.println(myset);
		//	treeset doesnt allow duplicates n sorts set
		java.util.Iterator it=myset.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
	//or also	for(String x:myset)
		//	System.out.println(x);
		//prints elements
	}

}
