package demo;

import java.util.Scanner;
import java.util.TreeSet;

public class tree_set_compare_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		TreeSet<Integer> array12=new TreeSet<Integer>();
		{
		array12.add(1);
		array12.add(2);
		array12.add(6);
		array12.add(7);
		array12.add(8);
		array12.add(9);
		System.out.println(array12);
	    }
		System.out.println("Enter a number");
		int n=s.nextInt();
     	for(int x:array12)
    	{
		 if(x>=n)
		 {
			System.out.println(x+" is found greater than or equal to "+n);
		 }
	    }
	}

}
