package helloworld;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class keyvalue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(2, "Java");
		hashmap1.put(1, "C#");
		hashmap1.put(6, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(3, "Fortran");
		System.out.println("Enter the key:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Set<Integer> a=hashmap1.keySet();
		for(int x:a)
		{
			if(x<n)
			{
				System.out.println(hashmap1.get(x));
			}
			
		}
		
	}

}