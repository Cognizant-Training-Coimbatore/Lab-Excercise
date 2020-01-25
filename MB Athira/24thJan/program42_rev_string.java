import java.util.Scanner;

public class program42_rev_string 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a string:");
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
	}

}
