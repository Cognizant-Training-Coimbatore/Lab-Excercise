package prgrms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class pr20lessequalakey {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "c#");
		hashmap1.put(3, "selenium");
		hashmap1.put(4, "perl");
		hashmap1.put(5, "cobol");
		hashmap1.put(6, "fortran");
		System.out.println(hashmap1);
		System.out.println("enter a key value");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		Set<Integer> key=hashmap1.keySet();
		for(int x:key)
		{
		if(x<=i)
		{
			System.out.print(x);
			String name=hashmap1.get(x);
			System.out.println(" "+name);
		}
		}

	}

}
