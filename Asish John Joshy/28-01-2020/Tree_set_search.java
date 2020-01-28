package demo;

import java.util.TreeSet;

public class Tree_set_search {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet<Integer> array11=new TreeSet<Integer>();
		{
		array11.add(1);
		array11.add(2);
		array11.add(6);
		array11.add(7);
		array11.add(8);
		array11.add(9);
		System.out.println(array11);
	}
	for(int x:array11)
	{
		if(x<7)
		{
			System.out.println(x+" is found less than 7");
		}
	}

}
}
