package demo;

import java.util.Scanner;

public class program29_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,number,greater;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size");
		size=input.nextInt();
		int n[]=new int[size];
		System.out.println("Enter 0 number");
		number=input.nextInt();
		greater=number;
		for(i=1;i<size;i++) {
			System.out.println("Enter "+i+" number");
			number=input.nextInt();
			n[i]=number;
			if(number>greater)
			{
				greater=number;
			}
		}
		System.out.print("Numbers are:");
		for(i=0;i<size;i++) {
			
			System.out.print(n[i]+" ");
		}
		System.out.println("Greatest number is "+greater);
	
	
			

	}

}
