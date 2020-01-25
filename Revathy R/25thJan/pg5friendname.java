package prgrms;

import java.util.Scanner;

public class pg5friendname {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] s=new String[5];
		int i=0;
		System.out.println("enter 5 names of your friends");
		for(i=0;i<5;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("the names of your friends are\n");
		for(i=0;i<5;i++)
		{
			System.out.println(s[i]+"\n");
		}
		
	}

}
