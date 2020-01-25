import java.util.Scanner;

public class prg10_qn10_inputnumbers_array 
{
	public static void main(String[] args) 
		{
			int a, smallest;
			Scanner sc = new Scanner(System.in);
			int t[] = new int[5];
			int i;
			System.out.println("Enter the number 0");
			a = sc.nextInt();
			smallest = a;
			for(i=1;i<5;i++)
			{
				System.out.println("Enter number "+i);
				a = sc.nextInt();
				t[i] = a;
				if(a <smallest)
				{
					smallest = a;
				}
			}
			for(i=0;i<5;i++)
			{
				System.out.println("Numbers are "+ t[i]);
			}
			System.out.println("Smallest no. "+smallest);
		}

	}