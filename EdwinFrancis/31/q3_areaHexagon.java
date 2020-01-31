package java_excercises;

import java.util.Scanner;

public class q3_areaHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		System.out.println("Enter the side:");
		Scanner input=new Scanner(System.in);
		s=input.nextInt();
		System.out.println(6*(s*s)/(4*Math.tan(3.14/6)));
		
		
		
		

	}

}
