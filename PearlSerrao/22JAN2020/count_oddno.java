package demo;

import java.util.Scanner;

public class count_oddno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the nos");
		Scanner in=new Scanner(System.in);
		
		int[] a=new int[5];
		int c=0,i;
		
		
		for(i=0;i<5;i++) {
			//Scanner s=new Scanner(System.in);
			a[i]=in.nextInt();
			if(a[i]%2!=0)
				c++;
		}
		System.out.println("odd nos are"+c);
}
	}


