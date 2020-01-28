

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class keyvalue1 {
		static void fun1(Map<Integer, String> hashmap1 )
		{
			int x1=1000,x2=0;
			Set<Integer> a=hashmap1.keySet();
			for(int x:a)
			{
				if(x<x1)
				{
					x1=x;
				}
				if(x>x2)
				{
					x2=x;
				}
			}
			System.out.println("Lowest key element:"+hashmap1.get(x1));
			System.out.println("Highest key element:"+hashmap1.get(x2));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(2, "Java");
		hashmap1.put(1, "C#");
		hashmap1.put(6, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(3, "Fortran");
		fun1(hashmap1);
	}

}
