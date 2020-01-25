package demo;

import java.util.Scanner;

public class sum_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter marks for 5 programs out of 100\n");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		int sum,avg;
		sum=a+b+c+d+e;
		avg=(sum/5);
		System.out.println("Marks out of 500="+sum);
		System.out.println("\nAverage="+avg+"%");
	}

}
