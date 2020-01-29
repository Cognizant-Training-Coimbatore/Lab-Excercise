package pckg;

import java.util.Scanner;

public class Q9_25JAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,3,6,2,7,1,8,9,10};
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=0;
		for(int i=0;i<10;i++)
		{if(a[i]==n)
		{f=1;
			}
			}
		if(f==1)
		{
			System.out.println("ITEM found");
			}
		else
			System.out.println("ITEM not found");
			}



}
