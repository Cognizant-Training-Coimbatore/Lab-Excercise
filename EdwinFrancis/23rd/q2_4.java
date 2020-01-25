import java.util.Scanner;

public class q2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,in,i;
		Scanner input=new Scanner(System.in);
		System.out.println("I'm thinking about a number between 0 and 9.Can you guess it? ("
				+"3 Attempt(s)");
		
		for(i=3;i>0;i--) {
			in=input.nextInt();
			if(in==n) {
				System.out.println("Write Answer!");
			}
			else if(i!=1)
				System.out.println("Sorry.Wrong number.I'm thinking about a number between 0"
						+ " and 9.Can you guess it?("+(i-1));
			else {
				System.out.println("Sorry.Wrong Number.The correct answer is "+n);
			}
		}
	}

}
