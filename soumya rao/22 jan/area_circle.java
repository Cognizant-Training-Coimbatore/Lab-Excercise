package demo;

import java.util.Scanner;

public class area_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final double pie=3.14;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of the circle");
double r=sc.nextFloat();

double area=pie*r*r;
System.out.println("the area of the circle is"+area);
	}

}
