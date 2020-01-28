package demo;

import java.util.HashMap;
import java.util.Scanner;

public class program35_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1,"Java");
		hashmap1.put(2,"C#");
		hashmap1.put(3,"Selenium");
		hashmap1.put(4,"Perl");
		hashmap1.put(5,"Cobol");
		hashmap1.put(6,"Fortan");
		int opt;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your option between 1 to 6");
		opt=input.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
		
		
		
		

	}

}
