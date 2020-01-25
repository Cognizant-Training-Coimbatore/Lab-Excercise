import java.util.Scanner;

public class program44_pallindrome_string 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String rev = "";
		int i = str1.length();
		
		for(int j=i-1;j>=0;j--)
		{
			char ch = str1.charAt(j);
			rev = rev+ ch;
			
		}
		System.out.println(rev);
		if(str1.equals(rev))
		System.out.println("Palindrome");
		else
			System.out.println("Not pallindrome");
	}

}
