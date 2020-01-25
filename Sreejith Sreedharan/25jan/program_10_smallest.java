package demo;
import java.util.*;
public class program_10_smallest {
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	int c=0;
	for(int i=0;i<5;i++)
	{a[i]=sc.nextInt();
}
	c=a[0];
	for(int i=0;i<5;i++)
	{if(a[i]<c)
		c=a[i];
		
	}
	System.out.println("smallest number is:"+c);
	
	
	}
}