package java_excercises;

import java.util.Scanner;

public class q10_multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]=new int[5];
		int a2[]=new int[5];
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 1st array:");
		for(i=0;i<5;i++) {
			a1[i]=input.nextInt();	
		}
		System.out.println("Enter 2nd array:");
		for(i=0;i<5;i++) {
			a2[i]=input.nextInt();	
		}
		for(i=0;i<5;i++) {
			System.out.println("AT index "+i+":"+(a1[i]*a2[i]));
		}
		


	}

}
