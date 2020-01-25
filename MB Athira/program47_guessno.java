import java.util.Scanner;

public class program47_guessno 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("I'm thinking of a number between 0 and 9. Guess it");
		for(int i =3; i>0; i--)
		{
			System.out.println("Guess the no.");
			Scanner sc1 = new Scanner(System.in);
			int b = sc1.nextInt();
			if(b==a)
			{
				System.out.println("You have guesed it right"+a);
			}
			else
			{
				System.out.println("Sorry. Wrong number. I'm thinking about a number between 0 to 9. Can you guess it? ("+(i-1)+" attempts left)");
			}
		}
	}

}
