package demo;

import java.util.Scanner;

public class question6_sumandavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double arr[]=new double[5];
		System.out.println("Enter the  nos");
		Scanner in=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		float avg;
		for(int i=0;i<5;i++) {
			arr[i]=in.nextInt();
			sum=sum+arr[i];
	
		}
		System.out.println("Sum is "+sum);
		avg=sum/5;
		System.out.println("Average is "+avg);
		
 
	}

}
