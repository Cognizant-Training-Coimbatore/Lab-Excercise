import java.util.Scanner;

public class program46_string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev))
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");}
	}

}
