import java.util.Scanner;

public class program30_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,number,greater;
		System.out.println("Enter the maximum size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int numbers1[]=new int[n];
		int i;
		System.out.println("Enter numbr 0");
		number=sc.nextInt();
		greater=number;
		for(i=1;i<n;i++)
		{
			System.out.println("Enter number"+i);
			number=sc.nextInt();
			numbers1[i]=number;
			if(number>greater)
			{
				greater=number;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Numbers are"+numbers1[i]);
			
		}
		System.out.println("Greater is"+greater);
	}

}
