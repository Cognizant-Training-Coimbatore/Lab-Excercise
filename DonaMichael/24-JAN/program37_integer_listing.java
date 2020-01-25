import java.util.Scanner;

public class program37_integer_listing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integers:");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1<n2) {
			for(int i=n1+1;i<n2;i++) {
				System.out.println(i);
			}
		}
		else{
			for(int i=n1-1;i>n2;i--) {
				System.out.println(i);
			}
		}
	}

}
