package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class tree_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("Java");
		myset.add("Selenium");
		myset.add("C++");
		myset.add("per1");
		myset.add("unix");
		myset.add("Java");
		System.out.println(myset);
		Iterator it1=myset.iterator();
		while(it1.hasNext())
		{
			Object obj=it1.next();
			System.out.println(obj);
		}
		for(Object obj:myset)
		{
			System.out.println(obj);
		}
	}

}
