package helloworld;

import java.util.TreeSet;

public class treesetequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> a=new TreeSet<Integer>();
		TreeSet<Integer> b=new TreeSet<Integer>();
		a.add(2);
		a.add(3);
		b.add(4);
		b.add(5);
		a.addAll(b);
		System.out.println(a);
	}

}
