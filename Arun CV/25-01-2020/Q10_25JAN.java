package pckg;

import java.util.Scanner;

public class Q10_25JAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number");
			a[i]=sc.nextInt();
			}
		int smallest=a[0];
		for(int j=1;j<5;j++)
		{if(a[j]<smallest)
			smallest=a[j];
					
			}
		System.out.println("Smallest :"+smallest);
			}
	}

