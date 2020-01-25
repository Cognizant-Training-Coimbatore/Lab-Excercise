import java.util.Random;
import java.util.Scanner;

public class program48_randomno 
{

	public static void main(String[] args) 
	{
		int m;
		Scanner sc = new Scanner(System.in);
		Random  rr = new Random();
		System.out.println("Enter the range:");
		m = sc.nextInt();
		System.out.println(rr.nextInt(m));
		
	}

}
