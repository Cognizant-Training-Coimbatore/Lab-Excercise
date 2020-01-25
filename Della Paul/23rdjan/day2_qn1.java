import java.util.Scanner;

public class day2_qn1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int x=sc.nextInt();
		System.out.println("enter the second no");
		int y=sc.nextInt();
		int i;
		for(i=x;i<y;i++)
		{
			System.out.println(x);
			x=x+1;
		}
	}

}
