import java.util.Scanner;

public class program18_threenumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("All numbers are equal");
			
		}
		else if(a!=b && b!=c && c!=a)
		{
			System.out.println("All numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
		
		

	}

}
