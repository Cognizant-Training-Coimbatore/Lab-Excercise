package demo;

import java.util.Scanner;

public class area_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pie=(float) 3.14,r,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius\n");
		r=s.nextInt();
		area=(r*r*pie);
		System.out.println("Area="+area);
		
	}

}
