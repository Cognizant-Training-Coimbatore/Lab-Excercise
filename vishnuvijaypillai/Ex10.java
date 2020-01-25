import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int i,l,flag=0;
		
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextLine();
		l=a.length();
		for(i=0;i<=((l-1)/2);i++)
		{
			if(a.charAt(i) == a.charAt((l-1)-i))
			{
				flag=0;
			}
			else
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("this is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome ");
		}

	}

}
