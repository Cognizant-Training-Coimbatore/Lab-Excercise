package demo;

import java.util.Scanner;

public class sum_avg {
	public static void main(String[] args) {
		
		System.out.println("enter 5 no");
		int n=0;
		
		int sum=0;
		for(int i=0;i<5;i++) {
			Scanner s=new Scanner(System.in);
			 n=s.nextInt();
			 sum=sum+n;
		}
		
		double avg=sum/5;
	
			System.out.println(" sum:"+sum+"avg:1"+avg);
			
		
		
	}
}
