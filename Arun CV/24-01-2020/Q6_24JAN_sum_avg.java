package p2_declare_variable;

import java.util.Scanner;

public class Q6_24JAN_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of N");
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		int sum=0;
		int a;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the number");
			a=scanner.nextInt();
			if(a==-999)
			{
				i=n;
			}
			else
			{
				sum+=a;
			}
		}
		System.out.println("sum : " +sum);
		System.out.println("average : " +sum/n);
	}

}
