import java.util.Scanner;

public class array_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=5;
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.println("Enter values");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=a[i];
			c[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(b[i]<b[j])
				{
					int t=b[j];
					b[j]=b[i];
					b[i]=t;
				}
				if(c[i]>c[j])
				{
					int te=c[j];
					c[j]=c[i];
					c[i]=te;
				}
			}
		}
		System.out.println("Entered Array");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Descending");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Ascending");
		for(int i=0;i<n;i++)
		{
			System.out.println(c[i]);
		}
	}

}
