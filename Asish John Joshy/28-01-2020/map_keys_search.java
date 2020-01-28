package demo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class map_keys_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		HashMap<Integer,String> a=new HashMap<Integer,String>();
		{
			a.put(1,"What");
			a.put(2,"is");
			a.put(3,"the");
			a.put(4,"meaning");
			a.put(5,"of");
			a.put(6,"this?");
		}
		System.out.println("Enter an index");
		int b=s.nextInt();
		Set<Integer> x=a.keySet();
		for(int y:x)
		{
		if(y<=b)
		{
			System.out.println("Less than or equal to "+b+" is "+a.get(y));	
		}
		}
		
	}

}
