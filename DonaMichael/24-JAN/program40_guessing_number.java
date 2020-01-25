import java.util.Scanner;

public class program40_guessing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("I am thinking about a number between 0 and 9.Can you guess it?(3 attempt(s))left");
		for(int i=0;i<3;i++) {
			
			int a=sc.nextInt();
			if(n==a)
			{
				System.out.println("You guessed the correct number");
				System.exit(0);
			}
			else {
				if(i==2) {
				System.out.println("Sorry.Wrong Number.The correct number is"+n);
				}
				else {
					System.out.println("Sorry.Wrong number.I am thinking about a number between 0 and 9.Can you guess it?"+(2-i)+"attempts left\n"); 
				}
			
			}
			}
			
	}

}
