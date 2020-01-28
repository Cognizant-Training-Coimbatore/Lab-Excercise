
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class keyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=1000,x2=0;
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(2, "Java");
		hashmap1.put(1, "C#");
		hashmap1.put(6, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(3, "Fortran");
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

}