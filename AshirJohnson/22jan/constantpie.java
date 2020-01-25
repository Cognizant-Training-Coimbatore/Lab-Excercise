package helloworld;

import java.util.Scanner;

public class constantpie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float a=3.14f;
		System.out.println("Enter the radius:");
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		System.out.println(a*r*r);
		
		
		}

}
