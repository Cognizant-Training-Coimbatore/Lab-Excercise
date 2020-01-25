import java.util.Scanner;

public class pgmn10strpalindrome{
	public static void main(String a1[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	reverse=reverse+str.charAt(i);
	  
	if(str.equals(reverse))
		{
		System.out.println("is palindorme");
		}
	else
		System.out.println("is not palindorme");
	}
	}