import java.util.Scanner;

public class Exer2_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int i=1, sum=0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number: ");
			x=scan.nextInt();
			if(x!=-999) {
				sum+=x;
				i++;				
			}
			else
				break;
		}
		System.out.println("Sum= "+sum+"\nAverage= "+sum/i);
	}

}
