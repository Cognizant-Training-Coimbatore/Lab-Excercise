import java.util.Scanner;


public class reverse_string {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String org, rev="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		org = scanner.nextLine();
		int length = org.length();
		int i;
		for(i=length-1; i>=0; i--)
		{
			rev+=org.charAt(i);
		}
		System.out.println("The reverse string is " +rev);
	}

}
