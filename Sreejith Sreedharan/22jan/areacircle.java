package demo;

import java.util.Scanner;

public class areacircle {
	public static void main(String args[])
	{final double pi=3.14;
	int r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius");
	r=sc.nextInt();
	double area;
	area=pi*r*r;
	System.out.println("area is:"+area);
	sc.close();

	}}
