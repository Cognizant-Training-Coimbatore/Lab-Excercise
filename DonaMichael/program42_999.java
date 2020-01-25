import java.util.Scanner;

public class program42_999 {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		int s=0,i=0;
		while(a!=999) {
			s=s+a;
			i=i+1;
			a=sc.nextInt();
		}
		System.out.println("Sum is:"+s);
		System.out.println("Averge is:"+(s/i));
	}

}
