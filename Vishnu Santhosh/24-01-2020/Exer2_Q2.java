import java.util.Scanner;

public class Exer2_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value of N [1-9]: ");
		int x = scan.nextInt();
		System.out.println("Multiplication table upto "+x+":");
		for(int i=1; i<=10;i++) {
			for(int j=1;j<=x;j++) {
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}

}
