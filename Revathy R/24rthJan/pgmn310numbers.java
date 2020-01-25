import java.util.Arrays;
import java.util.Scanner;
public class pgmn310numbers {

	public static void main(String[] args) {
		int[] ar=new int[10];
		Scanner sc=new Scanner(System.in);
		int s=0;
		System.out.println("enter the 10 numbers");
		for(int i=0;i<10;i++)
		{
			
			ar[i]=sc.nextInt();
			s=s+ar[i];
		}
		
		int max=ar[0],min=ar[0];
		for(int i=1;i<10;i++)
			{
			if(min>ar[i])
			min=ar[i];
			}
		for(int i=1;i<10;i++)
		{
		if(max<ar[i])
		max=ar[i];
		}
		System.out.println("minimum of the array is "+min);
		System.out.println("maximum of the array is "+max);
		System.out.println("average of the array is "+(s/10));
	}

}
