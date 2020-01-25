import java.util.Scanner;
import java.util.Arrays;
public class program41_max_min
{

	public static void main(String[] args) 
	{
		System.out.println("Enter 10 integers:");
		int i,s=0;;
		int a[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<10;i++)
		{
		a[i] = sc.nextInt();
		s=s+a[i];
		}
		int min=a[0],max=a[0];
		
		for(i=1;i<10;i++)
		{
			if(min>a[i])
			min=a[i];
			else
				max=a[i];
		}
		System.out.println("min= "+min);
		System.out.println("max= "+max);
		System.out.println("avg= "+(max+min)/2);
		
	}

}
