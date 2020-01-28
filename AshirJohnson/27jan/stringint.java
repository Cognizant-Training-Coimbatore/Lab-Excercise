package helloworld;

import java.util.Scanner;

public class stringint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		s=sc.next();
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)>47&&s.charAt(i)<58)
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

}
