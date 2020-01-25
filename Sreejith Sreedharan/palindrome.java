package demo;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		String a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLine();
		String rev="";
		int n;
		n=(a.length()-1);
		for(int i=n;i>=0;i--)
		{rev=rev+a.charAt(i);
		}
		
if(a.equals(rev))
	System.out.println("palindrome");
else
	System.out.println("not palindrome");
	}

}

