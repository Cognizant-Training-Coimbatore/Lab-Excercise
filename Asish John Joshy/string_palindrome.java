package demo;

import java.util.Scanner;

public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.nextLine();
		int c=0;
		for(int i=0;i<=(st.length()/2);i++)
		{
			if(st.charAt(i)!=st.charAt((st.length()-i-1)))
					{
				c++;
					}
		}
		if(c==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
