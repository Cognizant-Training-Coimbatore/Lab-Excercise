import java.util.Random;
import java.util.Scanner;

public class Exer2_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		String c;
		char ch='y';
		int temp;
		do {
			int n = rand.nextInt(9);
			for(int i=0;i<3;i++) {
				System.out.println("I'm thinking about a number between 0 and 9.");
				System.out.printf("Can you guess it? (%d attempt(s) left): ",3-i);
				temp=scan.nextInt();
				if(temp==n) {
					System.out.println("Your answer is right!");
					break;
				}
				else if(i==2){
					System.out.println("Sorry. Wrong number. The correct number is: "+n);
					
				}
				else
					System.out.println("Sorry. Wrong number.");
			}
			System.out.println("Do you want to try again?(y/n): ");
			c = scan.next();
			ch=c.charAt(0);
		}while(ch!='n');
	}

}
