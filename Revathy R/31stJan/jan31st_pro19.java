package pack1;

import java.util.Scanner;

public class jan31st_pro19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,m;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of first array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the element to be checked");
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				System.out.println("array contains "+m);
				System.exit(0);
			}
		}
		System.out.println("array doesn't contain "+m);

	}

}
