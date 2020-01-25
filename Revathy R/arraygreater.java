import java.util.Scanner;

public class arraygreater {

	public static void main(String[] args) {
		int n,a,max;
		System.out.println("enter the maximum size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a1[]=new int[n];
		System.out.println("enter the number 0");
		a=sc.nextInt();
		max=a;
		a1[0]=a;
		for(int i=1;i<n;i++)
		{
			System.out.println("enter number "+i);
			a=sc.nextInt();
			a1[i]=a;
			if(a>max)
			{
				max=a;
			}
			
		}
		for(int j=0;j<n;j++)
		{
			System.out.println("numbers are "+a1[j]);
			
		}
		System.out.println("greater is "+max);
	}

}
