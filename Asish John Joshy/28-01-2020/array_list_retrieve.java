package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array_list_retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		List<String> array4=new ArrayList<String>();
		{
			array4.add("What");
			array4.add("is");
			array4.add("happening");
			array4.add("here");
			array4.add("?");
		}
		System.out.println(array4);
		System.out.println("Enter the index");
		int p=s.nextInt();
		System.out.println(array4.get(p));
	}

}
