package demo;

import java.util.Scanner;

public class tables {
	public static void main(String[] args) {
		int no=0,n=0,i,j;
		System.out.println("enter a no between 1-9?");
		if(no>=9 || no<=1) {
			Scanner in=new Scanner(System.in);
			no=in.nextInt();
			for(i=1;i<=no;i++) {
				for(j=1;j<=10;j++)
				n=i*j;
				System.out.println(i+"x"+j+"="+n);
			}
		}
	}

}
