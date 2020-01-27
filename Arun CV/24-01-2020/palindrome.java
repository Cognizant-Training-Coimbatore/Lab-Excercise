package p2_declare_variable;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the word");
		str = scanner.nextLine();
		
		int length = str.length();
		for(int i=length-1; i>=0; i--)
		{
		rev += str.charAt(i);
		if(str.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		}
		}

}
