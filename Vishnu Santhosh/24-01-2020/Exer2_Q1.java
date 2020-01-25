import java.util.Scanner;

public class Exer2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int x = scan.nextInt();
		System.out.print("Enter the upper limit: ");
		int y = scan.nextInt();
		System.out.print("Output: ");
		for(int i=x+1;i<y;i++) {
			System.out.print(i+"\t");
		}
	}

}
