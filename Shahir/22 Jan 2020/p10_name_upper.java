import java.util.Scanner;

public class p10_name_upper
{

	public static void main(String[] args)
	{
		System.out.println("Enter the name=");
		Scanner s1 = new Scanner(System.in);
		String a=s1.next();
		System.out.println("The name in uppercase="+a.toUpperCase());
		System.out.println("The length of a="+a.length());
	}

}
