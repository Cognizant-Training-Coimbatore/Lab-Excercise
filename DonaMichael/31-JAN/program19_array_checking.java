import java.util.Scanner;

public class program19_array_checking {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be checked");
		int m=sc.nextInt();
		
		for(int j=0;j<n;j++)
		{
			
			if(a[j]==m)
			{
				System.out.println("array contains "+m);
				System.exit(0);
			}
			
		}
		System.out.println("array doesnot contain "+m);
				
		

	}

}
