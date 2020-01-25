import java.util.Scanner;

public class program39_display_max_min_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int s=0;
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
			s=s+ar[i];
		}
		System.out.println("Average of 10 numbers="+(s/10));
		int min=ar[0],max=ar[0];
		for(int i=1;i<=9;i++)
		{
			if(min>ar[i])
				min=ar[i];
			else
				max=ar[i];
					}
		System.out.println("Smallest:"+min);
		System.out.println("Largest:"+max);
	}

}
