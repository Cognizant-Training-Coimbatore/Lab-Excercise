package demo;
import java.util.*;

public class sequentialsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int b;
		System.out.println("Enter 10 values");
		for(int i=0;i<10;i++)
		{a[i]=sc.nextInt();
		}
	System.out.println("Enter number to be searched");
	b=sc.nextInt();
	for(int j=0;j<10;j++)
	{if(a[j]==b)
		{System.out.println("number is present at"+j);
	System.exit(0);}
	}
	System.out.println("number is not found");
	
	}

}
