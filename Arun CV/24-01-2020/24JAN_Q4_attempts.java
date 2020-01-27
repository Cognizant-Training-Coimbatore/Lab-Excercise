import java.util.Scanner;

public class attempts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i;
		for(i=3; i>=1; i--)
		{
			System.out.println("I'm thinking of a random number between 0 to 9. Can you guess it?("+i+"attempts left )");
			int n=scanner.nextInt();
			if(n==9)
			{
			 break;	
			}
			else
			{
				System.out.println("Oops wrong number");
			}
		}
		System.out.println("Great! The number is 9");
	}

}
