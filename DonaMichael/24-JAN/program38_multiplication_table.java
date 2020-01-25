import java.util.Scanner;

public class program38_multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<10;j++)
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}

}
