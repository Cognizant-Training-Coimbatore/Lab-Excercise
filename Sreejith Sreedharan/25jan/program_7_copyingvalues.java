package demo;

import java.util.Scanner;

public class program_7_copyingvalues {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		System.out.println("Copied array is");
	for(int i=0;i<5;i++)
{b[i]=a[i];
System.out.println(b[i]);
}
	}

}
