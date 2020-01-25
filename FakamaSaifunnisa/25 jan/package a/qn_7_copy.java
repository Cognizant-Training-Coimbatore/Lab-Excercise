package packA;

import java.util.Scanner;

public class qn_7_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int m=sc.nextInt();
		int n[]=new int[m];
		int c[]=new int[m];
		for( i=0;i<m;i++)
		{
			int number=sc.nextInt();
			n[i]=number;
			
		}
		for(i=0;i<m;i++) {
			c[i]=n[i];
		}
		System.out.println("the copy is: ");
		for(i=0;i<m;i++) {
			System.out.print(c[i]);
		}
		
		
		
		
	
	}

}
