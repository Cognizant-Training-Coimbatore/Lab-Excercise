import java.util.Scanner;

public class program_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number");
		int i;
		for(i=0;i<n;i++)
		{
			int number=sc.nextInt();
			a[i]=number;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
