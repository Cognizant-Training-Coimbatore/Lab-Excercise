package helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(7);
		System.out.println("enter the replacing no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		for(int x:a)
		{
			if(x==n)
			{
				break;
			}
			i++;
		}
		System.out.println("Enter the number:");
		n=sc.nextInt();
		a.set(i, n);
		System.out.println(a);
	}

}
