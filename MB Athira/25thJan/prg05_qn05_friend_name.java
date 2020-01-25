import java.util.Scanner;

public class prg05_qn05_friend_name 
{

	public static void main(String[] args) 
	{
		String f[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your friend's name:");
		for (int i = 0; i < f.length; i++) 
		{
			f[i] = sc.nextLine();
		}
		System.out.println("Displaying names in upper case:");
		for (int i = 0; i < f.length; i++) 
		{
			String a = f[i].toUpperCase();
			System.out.println(a);
		}
	}

}
