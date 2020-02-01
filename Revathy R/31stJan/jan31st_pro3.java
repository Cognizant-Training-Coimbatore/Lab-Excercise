package pack1;

import java.util.Scanner;

public class jan31st_pro3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int s=sc.nextInt();
		double area=(6*s*s)/(4*(1/1.73));
		System.out.println("Area of hexagon is "+area);
	}

}
