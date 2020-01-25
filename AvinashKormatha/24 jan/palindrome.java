import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s,rev="";
		System.out.println("enter the string");
		s= sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("entered string is palindrome");
		}
		else
		{
			System.out.println("entered string is not palindrome");
		}
	}

}
