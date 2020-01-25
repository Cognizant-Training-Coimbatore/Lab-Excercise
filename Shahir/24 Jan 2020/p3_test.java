import java.util.Scanner;

public class p3_test {

	public static void main(String[] args) {
		int min=0, max=0, sum=0, a;
		System.out.println("Enter the numbers:");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println((i+1)+ "number:");
			a=s.nextInt();
			sum+=a;
			if(i==0)
			{
				min=a;
				
			}
			else if(min>a)
			{
				min=a;
			}
			if (i==0)
			{
				max=a;
			}
			else if(max<a)
			{
				max=a;
			}
		}
		System.out.println("Mininum: "+min);
		System.out.println("Maximum: "+max);
		System.out.println("Average: "+sum/10);
		
	}

}
