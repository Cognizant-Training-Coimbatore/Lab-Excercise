import java.util.Scanner;

public class program10_array_multiplication {

	public static void main(String[] args) {
		System.out.println("enter thr size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		System.out.println("Enter elements of first array: ");
		for(int i=0;i<n;i++)
		{
				a[i]=sc.nextInt();
				
		}
		System.out.println("Enter elements of second array: ");
		
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]*b[i]);
		}

	}

}
