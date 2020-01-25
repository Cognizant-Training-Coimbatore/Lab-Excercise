import java.util.Scanner;

public class array_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter values");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		System.out.println("Copies array");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}

}
