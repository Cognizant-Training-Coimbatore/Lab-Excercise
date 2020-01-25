import java.util.Scanner;

class parameter1
{
	parameter1(int n, char c)
	{
		System.out.println(n);
		System.out.println(c);
	}
	parameter1(char c, int n)
	{
		System.out.println(c);
		System.out.println(n);
	}
}
public class program37_integer_chara 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number and charcter :");
		int a = sc.nextInt();
		char b = sc.next().charAt(0);
		
		System.out.println("Enter chara and no. :");
		char d = sc.next().charAt(0);
		int e = sc.nextInt();
		parameter1 pt = new parameter1( a, b);
		parameter1 pt1 = new parameter1(d, e);
	}

}
