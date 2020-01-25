import java.util.Random;
import java.util.Scanner;

public class p4_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		String c;
		char ch='y';
		int temp;
		do
		{
			int n = r.nextInt(9);
			for(int i=0;i<3;i++) 
			{
				System.out.println("I am thinking a number between 0 and 9");
				System.out.printf("Can you guess it ?(%dattempt(s) remaining)",3-i);
				temp=s.nextInt();
				if(temp==n)
				{
					System.out.println("You answer is correct");
					break;
				}
				else if(i==2)
				{
					System.out.println("Sorry. Wrong guess. The answer is: "+n);
				}
				else
				{
					System.out.println("Sorry wrong numbeer");
				}
			}
			System.out.println("Do you want to try again? (Y/N)");
			c = s.next();
			ch=c.charAt(0);
		}
		while(ch!='n');
	}

}
