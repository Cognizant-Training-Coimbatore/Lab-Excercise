package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> array5=new ArrayList<String>();
		{
			array5.add("I");
			array5.add("am");
			array5.add("not");
			array5.add("loving");
			array5.add("it");
		}
		System.out.println(array5);
		System.out.println("Enter an element to be replaced");
		String p=s.nextLine();
		int a=array5.indexOf(p);
		System.out.println("Enter an element to replace it");
		String ps=s.nextLine();
		array5.set(a,ps);
		System.out.println(array5);
	}

}
