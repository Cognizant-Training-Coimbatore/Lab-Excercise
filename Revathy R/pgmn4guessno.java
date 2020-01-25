import java.util.Scanner;

public class pgmn4guessno {

	public static void main(String[] args) {
		//int n,a;
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number between 0 and 9");
		//n=sc.nextInt();
		int n,a;
		n=(int)(Math.random()*(10-1))+1;
		System.out.println("I'm thinking about a number between 0 and 9.Can you guess it?(3 attempt(s) left)\n");
		for(int i=0;i<3;i++)
		{
			
			a=sc.nextInt();
			if(n==a)
			{System.out.println("you guessed the correct number\n");
			System.exit(0);
			}
			else
			{
				if(i==2)
				{
					System.out.println("Sorry.Wrong number.The correct number is "+n);
				}
				else
				System.out.println("Sorry.Wrong number.I'm thinking about a number between 0 and 9.Can you guess it?("+(2-i)+" attempt(s) left)\\n");
			}
			
		}
		

	}

}
