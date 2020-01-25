package packB;

import java.util.Scanner;

public class arraygreatest {

	public static void main(String[] args) {
	int a,greater=0;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	int n[]=new int[a];
	for(int i=0;i<a;i++)
	{System.out.println("enter the "+i+" Element");
	n[i]=sc.nextInt();
	if(greater<n[i])
		greater=n[i];
		
	}
	
	for(int i=0;i<a;i++)
		System.out.println(n[i]);
	System.out.println("greatest number is "+greater);
	
	
	
	
	}

}
