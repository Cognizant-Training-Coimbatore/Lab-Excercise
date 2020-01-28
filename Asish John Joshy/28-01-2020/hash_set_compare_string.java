package demo;

import java.util.HashSet;

public class hash_set_compare_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		HashSet<String> array9=new HashSet<String>();
		{
			array9.add("This");
			array9.add("is");
			array9.add("not");
			array9.add("lovely");
			array9.add("at");
			array9.add("all");
		}
		HashSet<String> array10=new HashSet<String>();
		{
			array10.add("This");
			array10.add("has");
			array10.add("never");
			array10.add("been");
			array10.add("this");
			array10.add("lovely");
		}
		array9.retainAll(array10);
		System.out.println(array9);
		array10.retainAll(array9);
		System.out.println(array10);
	}

}
