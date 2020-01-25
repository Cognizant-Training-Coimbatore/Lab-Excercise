import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int a= r.nextInt(9);
		System.out.println(a);
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("I'm thinking about a number between 0 and 9.can you guess it?");
		for(int i=0;i<3;i++)
		{
			System.out.println("enter number");
			n=sc.nextInt();
			if(n==a) {
				System.out.println("correct number");
			}
			else
			{
				System.out.println("sorry.wrong number.I'm thinking about a number between 0 and 9.can you guess it?");
			}
		}
		System.out.println("the number is: "+a);
	}

}
