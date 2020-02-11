import java.util.Scanner;

public class program20_remove_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,m;
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of the array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the element to be removed");
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==m)
			{
				for(int j=i;j<n-1;j++)
				{
					a[j]=a[j+1];
					System.out.print(a[j]+"\n");
				}
				System.exit(0);
			}
			System.out.println(a[i]);
		}

	}

}
