package demo;

import java.util.HashMap;
import java.util.Scanner;

public class hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1,"Java");
		hashmap1.put(2,"C#");
		hashmap1.put(3,"Selenium");
		hashmap1.put(4,"Perl");
		hashmap1.put(5,"Cobol");
		hashmap1.put(6,"Fortran");
		int opt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your option between 1 and 6");
		opt=s.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
	}

}
