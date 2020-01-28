package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class program34_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> myset=new TreeSet<String>();
		myset.add("java");
		myset.add("selenium");
		myset.add("c++");
		myset.add("perl");
		myset.add("unix");
		myset.add("ada");
		myset.add("java");
		System.out.println(myset);
		Iterator it1=myset.iterator();
		System.out.println("Using iterator Object.....");
		while(it1.hasNext()) {
			Object obj=it1.next();
			System.out.println(obj);
		}
		System.out.println("Using for loop.....");
		for(Object obj:myset) {
			System.out.println(obj);
		}

		

	}

}
