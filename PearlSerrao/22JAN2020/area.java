package demo;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		Scanner s=new Scanner(System.in);
		int radius=s.nextInt();
		double area=pi*radius*radius;
		System.out.println("area is:"+area);
		
	}

}
