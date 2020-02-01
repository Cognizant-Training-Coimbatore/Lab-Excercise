package pack1;

import java.util.Scanner;

public class jan31st_pro10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the elements of first array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the elements of second array");
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]*b[i]);
		}
	}

}
