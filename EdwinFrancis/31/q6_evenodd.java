package java_excercises;

import java.util.Scanner;

public class q6_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int in;
		System.out.println("Enter a number");
		Scanner input=new Scanner(System.in);
		in=input.nextInt();
		if(in%2==0) {
			System.out.println('1');
		}
		else {
			System.out.println('0');
		}
	}

}
