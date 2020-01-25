import java.util.Scanner;

public class ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 integers(small and large)");
		n1=input.nextInt();
		n2=input.nextInt();
		while(n1<(n2+1)) {
			System.out.println(n1);
			n1++;
		}
	}

}
